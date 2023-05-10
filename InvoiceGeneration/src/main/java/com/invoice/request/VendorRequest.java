package com.invoice.request;

import lombok.Data;

@Data
public class VendorRequest {

	private Long vendorId;

	private String vendorName;

	private String City;

	private String Country;

	private String Pincode;

}
