package com.invoice.response;

import lombok.Data;

@Data
public class VendorResponse {
	
	private Long vendorId;

	private String vendorName;

	private String City;

	private String Country;

	private String Pincode;

}
