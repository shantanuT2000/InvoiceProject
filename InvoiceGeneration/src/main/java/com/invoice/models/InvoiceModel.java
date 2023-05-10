package com.invoice.models;

import java.time.LocalDate;
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
@Table(name = "invoices")
@Data
public class InvoiceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private Long invoiceId;

    @Column(name = "invoice_no")
    private String invoiceNo;

    @ManyToOne
    @JoinColumn(name = "fk_vendor_id")
    private VendorModel vendorModel;

    @ManyToOne
    @JoinColumn(name = "fk_customer_id")
    private CustomerModel customerModel;

    @Column(name = "billing_start_date")
    private LocalDate billingStartDate;

    @Column(name = "billing_end_date")
    private LocalDate billingEndDate;

    @OneToMany(mappedBy = "invoiceModel")
    private List<InvoiceInlineModel> invoiceLine;


}

