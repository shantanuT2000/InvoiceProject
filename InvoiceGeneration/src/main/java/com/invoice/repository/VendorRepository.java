package com.invoice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.invoice.models.VendorModel;

public interface VendorRepository extends JpaRepository<VendorModel,Long> {
	
	public List<VendorModel> findByIsDeletedFalse();

}