package com.cts.invoice.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InvoiceEntry {

	String medicine;
	String patient;
	long invoiceNumber;	// common for one transaction
	@JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy")
	Date dateOfSale;
	String modeOfPayment;
}
