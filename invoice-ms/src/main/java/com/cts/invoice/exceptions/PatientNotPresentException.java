package com.cts.invoice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Patient Entry not found")
public class PatientNotPresentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public PatientNotPresentException() {
		super("Feign Exchange service error");
		log.debug("Exception Called");
	}


}
