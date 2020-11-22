package com.cts.invoice.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	long m_id;
	long p_id;
	long invoiceNumber;	// common for one transaction
	Date dateOfSale;
	String modeOfPayment;
	
	
}
