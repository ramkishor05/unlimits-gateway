package com.brijframework.production.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.EOVendor;

@Repository
@Transactional
public interface VendorRepository extends JpaRepository<EOVendor, Long>{

}
