package com.cts.invoice.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	long m_id;
	long p_id;
	long invoiceNumber;	// common for one transaction
	@JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy")
	Date dateOfSale;
	String modeOfPayment;
	
	
}
