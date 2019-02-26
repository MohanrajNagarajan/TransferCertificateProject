package com.student.transfercertificate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.transfercertificate.model.TransferCertificate;
import com.student.transfercertificate.service.TransferCertificateService;
import com.student.transfercertificate.util.PDFGenerateUtil;

@Controller
public class StudentController {
	
	@Autowired
	TransferCertificateService certificateService;
	

	PDFGenerateUtil util;

	
	@RequestMapping(value= "/tcdetails",method=RequestMethod.GET)
	public String getTransferCerticateDetails(Model model){
		List<TransferCertificate> transferCertificates = certificateService.getTransferCerticateDetails();
		model.addAttribute("tcdetails", transferCertificates);
		System.out.println(transferCertificates.toString());
		return "TCDetails";

	}
	
	@RequestMapping(value= "/generate",method=RequestMethod.POST)
	public String saveDocument(Model model,@RequestParam("serialnumber") String serialNumber){
		util = new PDFGenerateUtil();
		System.out.println(serialNumber);
		TransferCertificate transferCertificate = certificateService.findBySerialNo(Long.parseLong(serialNumber));
		System.out.println(transferCertificate.toString());
		String generatePDFPath = util.geneatePDF(transferCertificate);
		model.addAttribute("pdfpath", generatePDFPath);
		return "Success";

	}
}
