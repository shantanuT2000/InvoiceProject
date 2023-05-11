package com.invoice.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "vendor")
@Data
public class VendorModel {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "vendor_id")
	    private Long vendorId;

	    @Column(name = "vendor_name")
	    private String vendorName;

	    @Column(name = "vendor_city")
	    private String City;

	    @Column(name = "vendor_country")
	    private String Country;

	    @Column(name = "pincode")
	    private String Pincode;

	    @OneToMany(mappedBy = "vendorModel")
	    private List<InvoiceModel> invoiceModels;
	    
//	    @ManyToOne
//	    @JoinColumn(name = "fk_customer_id")
//	    private CustomerModel customerModel;

	    @OneToMany(cascade=CascadeType.ALL)
	    @JoinColumn(name="vendorId")
	    private List<CustomerModel> customerModels;
	    
	    @OneToMany(cascade=CascadeType.ALL)
	    @JsonManagedReference
	    @JoinColumn(name="vendor_id")
	    private List<ProductModel> productModels;
}
