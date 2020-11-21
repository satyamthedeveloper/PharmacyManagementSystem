package com.cts.invoice.model;

import java.sql.Date;

import lombok.Data;

@Data
public class Patient {

	long p_id;
	String name;
	Date dateOfBirth;
	char gender;
	boolean active;
	long mobileNumber;
}
