package com.invoice.request;

import lombok.Data;

@Data
public class InvoiceInlineRequest {

	private Long lineItemId;

	private int quantity;

	private int WorkingHours;

	private int price;

}
