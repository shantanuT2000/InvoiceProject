package com.invoice.transformers;

import java.util.List;
import java.util.stream.Collectors;
import com.invoice.models.VendorModel;
import com.invoice.response.VendorResponse;

public class ResponseConverter {
	
	public VendorResponse entityToVendorResponse(VendorModel vendorEntity) {
		   
		   VendorResponse vendorResponse = new VendorResponse();
		   
		   vendorResponse.setVendorId( vendorEntity.getVendorId());
		   vendorResponse.setVendorName( vendorEntity.getVendorName());
		   vendorResponse.setCity( vendorEntity.getCity());
		   vendorResponse.setCountry( vendorEntity.getCountry());
		   vendorResponse.setPincode( vendorEntity.getPincode());
		   
		   return vendorResponse;
	   }
	   
	   public List<VendorResponse> toVendorResponseList(List<VendorModel> vendorEntityList){
		   
		   return vendorEntityList.stream().map(vendor-> entityToVendorResponse(vendor)).collect(Collectors.toList());
	   }

}
