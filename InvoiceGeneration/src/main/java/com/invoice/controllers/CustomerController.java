package com.invoice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.invoice.models.CustomerModel;
import com.invoice.repository.CustomerRepository;

@RestController
public class CustomerController {
	
	@Autowired
    CustomerRepository customerRepo;

//	@PostMapping("/excel")
	@GetMapping
	public List<CustomerModel> getAllCustomer(MultipartFile excelFile){
		
		return customerRepo.findAll();
		
	}
	
	
}
