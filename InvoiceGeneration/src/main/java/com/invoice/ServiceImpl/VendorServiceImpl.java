package com.invoice.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Company.repository.RegistrationRepository;
import com.Company.response.RegistrationResponse;
import com.invoice.Service.VendorService;
import com.invoice.repository.VendorRepository;
import com.invoice.response.VendorResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class VendorServiceImpl implements VendorService{
	
	@Autowired
	private VendorRepository vendorRepository;
	
	@Override
	public List<VendorResponse> getVendordetails() {

		log.info("Getting data");

		return responseConverter.toRegistrationResponseList(vendorRepository.findByIsDeletedFalse());

	}

}
