package com.cts.patient.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.patient.dao.PatientDao;
import com.cts.patient.model.Patient;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDao patientDao;

	// returns List of patients
	@Override
	public List<Patient> getAllPatientDetails() {
		log.debug("START");
		return patientDao.findAll();
	}

	//return patient by id
	@Override
	public Optional<Patient> getPatientDetailsById(long id) {
		log.debug("START");
		return patientDao.findById(id);
	}

	//insert patient in db
	@Override
	public boolean addPatient(Patient patient) {
		log.debug("START");
		if(patientDao.save(patient) != null) {
			return true;
		}
		
		return false;
	}
}
