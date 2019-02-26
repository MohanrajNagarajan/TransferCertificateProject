package com.student.transfercertificate.service;

import java.util.List;

import com.student.transfercertificate.model.TransferCertificate;
import com.student.transfercertificate.repository.TransferCertificateRepository;

public interface TransferCertificateService   {

	public List<TransferCertificate> getTransferCerticateDetails();
	public TransferCertificate findBySerialNo(Long serialNumber);
}
