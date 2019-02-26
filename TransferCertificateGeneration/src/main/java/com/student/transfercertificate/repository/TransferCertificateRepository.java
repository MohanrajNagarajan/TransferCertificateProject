package com.student.transfercertificate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.transfercertificate.model.TransferCertificate;

@Repository
public interface TransferCertificateRepository extends JpaRepository<TransferCertificate, Integer>{
	public TransferCertificate findBySerialNo(Long serialNumber);
}
