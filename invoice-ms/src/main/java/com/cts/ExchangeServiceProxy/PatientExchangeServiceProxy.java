package com.cts.ExchangeServiceProxy;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.invoice.exceptions.PatientNotPresentException;
import com.cts.invoice.model.Patient;

@FeignClient(name = "patient-ms")
public interface PatientExchangeServiceProxy{

	@GetMapping("/{id}")
	public Optional<Patient> getPatientDetailsById(@PathVariable("id") long id) throws PatientNotPresentException;
	
}
