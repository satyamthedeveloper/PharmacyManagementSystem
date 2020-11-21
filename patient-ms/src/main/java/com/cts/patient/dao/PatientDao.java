package com.cts.patient.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.patient.model.Patient;

@Repository
public interface PatientDao extends JpaRepository<Patient, Long>{

}
