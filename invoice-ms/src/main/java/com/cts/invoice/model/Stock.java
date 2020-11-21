package com.cts.invoice.model;

import java.sql.Date;

import lombok.Data;

@Data
public class Stock {

	long m_id;
	String medicineName;
	int countStock;
	Date dateOfManufacturing;
	Date dateOfExpiry;
	String Manufacturer;
}
