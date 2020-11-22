package com.cts.stock.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.PositiveOrZero;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	long m_id;
	String medicineName;
	@PositiveOrZero
	int countStock;
	@JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy")
	Date dateOfManufacturing;
	@JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy")
	Date dateOfExpiry;
	String Manufacturer;

}
