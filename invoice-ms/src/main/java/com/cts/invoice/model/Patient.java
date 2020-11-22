package com.cts.invoice.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Patient {

	long p_id;
	String name;
	@JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy")
	Date dateOfBirth;
	char gender;
	boolean active;
	long mobileNumber;
}
