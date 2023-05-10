package com.invoice.request;

import java.time.LocalDate;

import lombok.Getter;
@Getter
public class InvoiceRequest {

	private Long invoiceId;

	private String invoiceNo;

	private LocalDate billingStartDate;

	private LocalDate billingEndDate;

}
