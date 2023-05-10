package com.invoice.request;

import lombok.Data;

@Data
public class CustomerRequest {
	
	private Long CustomerId;
	
	private String firstName;
	
	private String lastName;
	
	private String customerEmail;
	
	private String customerPhoneNumber;
	
	private String City;
	
	private String Country;
	
	private String InvoiceNumber;
	
	
	
}
