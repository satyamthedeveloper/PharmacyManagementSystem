package com.cts.patient.services;

import java.util.List;
import java.util.Optional;

import com.cts.patient.model.Patient;

public interface PatientService {

	List<Patient> getAllPatientDetails();

	Optional<Patient> getPatientDetailsById(long id);

	boolean addPatient(Patient patient);

}
