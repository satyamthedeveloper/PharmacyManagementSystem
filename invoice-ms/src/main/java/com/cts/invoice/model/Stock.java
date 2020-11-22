package com.cts.invoice.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Stock {

	long m_id;
	String medicineName;
	int countStock;
	@JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy")
	Date dateOfManufacturing;
	@JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy")
	Date dateOfExpiry;
	String Manufacturer;
}
