package com.cts.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cts.patient.services.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;
}
