package com.cts.stock.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Entity
@Data
@Slf4j
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	long m_id;
	String medicineName;
	int countStock;
	Date dateOfManufacturing;
	Date dateOfExpiry;
	String Manufacturer;
	
	public Stock() {
		super();
		log.info("Medicine Created");
	}
	
	
}
