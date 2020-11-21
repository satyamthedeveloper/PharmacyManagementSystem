package com.cts.patient.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long p_id;
	String name;
	Date dateOfBirth;
	char gender;
	boolean active;
	long mobileNumber;
	
}
