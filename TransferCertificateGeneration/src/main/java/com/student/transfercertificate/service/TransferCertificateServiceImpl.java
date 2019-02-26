package com.student.transfercertificate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.transfercertificate.model.TransferCertificate;
import com.student.transfercertificate.repository.TransferCertificateRepository;

@Service
public class TransferCertificateServiceImpl implements TransferCertificateService{
	
	@Autowired
    TransferCertificateRepository transferCertificateRepository;

	public List<TransferCertificate> getTransferCerticateDetails() {
		// TODO Auto-generated method stub
		return transferCertificateRepository.findAll();
	}

	@Override
	public TransferCertificate findBySerialNo(Long serialNumber) {
		// TODO Auto-generated method stub
		return transferCertificateRepository.findBySerialNo(serialNumber);
	}


	

}
