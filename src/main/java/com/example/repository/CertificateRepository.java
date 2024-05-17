package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Certificate;


@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long>{

	

}
