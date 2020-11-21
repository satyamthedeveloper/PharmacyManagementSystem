package com.cts.patient.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.patient.dao.PatientDao;

public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDao patientDao;
}
