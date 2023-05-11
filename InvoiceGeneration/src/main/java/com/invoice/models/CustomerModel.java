package com.invoice.models;

import java.util.List;

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
@Table(name = "customer")
@Data
public class CustomerModel {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "customer_id")
	    private Long CustomerId;

	    @Column(name = "first_name")
	    private String firstName;

	    @Column(name = "last_name")
	    private String lastName;

	    @Column(name = "customer_email")
	    private String customerEmail;

	    @Column(name = "customer_phone_number")
	    private String customerPhoneNumber;
	    
	    @Column(name = "city")
	    private String City;

	    @Column(name = "country")
	    private String Country;
	    
	    @Column(name = "invoice_number")
	    private String InvoiceNumber;


	    @OneToMany(mappedBy = "customerModel")
	    private List<InvoiceModel> invoiceModels;
	    
//	    @OneToMany(mappedBy = "customerModel")
//	    private List<VendorModel> vendorModels;
//	    
//	    @ManyToOne
//	    @JoinColumn(name = "fk_customer_id")
//	    private CustomerModel customerModel;
	    
	    @ManyToOne
	    @JoinColumn(name = "fk_vendor_id")
	    private VendorModel vendorModel;


	    
	}



