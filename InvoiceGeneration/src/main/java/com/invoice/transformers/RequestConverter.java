package com.invoice.transformers;

import org.springframework.stereotype.Component;

import com.invoice.models.InvoiceInlineModel;
import com.invoice.models.ProductModel;
import com.invoice.models.VendorModel;
import com.invoice.request.InvoiceInlineRequest;
import com.invoice.request.ProductRequest;
import com.invoice.request.VendorRequest;

@Component
public class RequestConverter {
	
	public VendorModel toVendorModel(VendorRequest vendorRequest) {

		if(vendorRequest==null) {
			return null;
		}
		VendorModel vendorModel = new VendorModel();

		vendorModel.setVendorName(vendorRequest.getVendorName());
		vendorModel.setCity(vendorRequest.getCity());
		vendorModel.setCountry(vendorRequest.getCountry());
		vendorModel.setPincode(vendorRequest.getPincode());
		vendorModel.setProductModels(vendorRequest.getProductModels());

		return vendorModel;

	}
	
	public ProductModel toProductModel(ProductRequest productRequest) {

		if(productRequest==null) {
			return null;
		}
		ProductModel productModel = new ProductModel();

		productModel.setProductId(productRequest.getProductId());
		productModel.setName(productRequest.getName());
		productModel.setPrice(productRequest.getPrice());
		productModel.setDescription(productRequest.getDescription());

		return productModel;

	}
	
	public InvoiceInlineModel toInvoiceInlineModel(InvoiceInlineRequest invoiceInlineRequest) {

		if(invoiceInlineRequest==null) {
			return null;
		}
		InvoiceInlineModel invoiceInlineModel = new InvoiceInlineModel();

		invoiceInlineModel.setLineItemId( invoiceInlineRequest.getLineItemId());
		invoiceInlineModel.setQuantity( invoiceInlineRequest.getQuantity());
		invoiceInlineModel.setWorkingHours( invoiceInlineRequest.getWorkingHours());
		invoiceInlineModel.setPrice( invoiceInlineRequest.getPrice());

		return invoiceInlineModel;

	}

}
