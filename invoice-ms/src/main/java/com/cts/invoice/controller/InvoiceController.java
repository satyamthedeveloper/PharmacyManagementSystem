package com.cts.invoice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.invoice.exceptions.PatientNotPresentException;
import com.cts.invoice.exceptions.StockNotPresentException;
import com.cts.invoice.model.InvoiceEntry;
import com.cts.invoice.services.InvoiceService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value = "/")
public class InvoiceController {

	@Autowired
	private InvoiceService invoiceService;
	
	// returns every detail available
	@GetMapping
	public ResponseEntity<?> getAllDetails() throws PatientNotPresentException, StockNotPresentException{
		log.debug("START");
		List<InvoiceEntry> results = invoiceService.getAllDetails();
		if(results.isEmpty())
			return new ResponseEntity<String>("Database is Empty", HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<InvoiceEntry>>(results, HttpStatus.OK);
	}
}
