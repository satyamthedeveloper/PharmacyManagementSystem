package com.cts.invoice.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ExchangeServiceProxy.PatientExchangeServiceProxy;
import com.cts.ExchangeServiceProxy.StockExchangeServiceProxy;
import com.cts.invoice.dao.InvoiceDao;
import com.cts.invoice.exceptions.PatientNotPresentException;
import com.cts.invoice.exceptions.StockNotPresentException;
import com.cts.invoice.model.Invoice;
import com.cts.invoice.model.InvoiceEntry;
import com.cts.invoice.model.Patient;
import com.cts.invoice.model.Stock;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class InvoiceServiceImpl implements InvoiceService{

	@Autowired
	private InvoiceDao invoiceDao;
	
	@Autowired
	PatientExchangeServiceProxy patientExchangeService;
	
	@Autowired
	StockExchangeServiceProxy stockExchangeService;

	@Override
	public List<InvoiceEntry> getAllDetails() throws PatientNotPresentException, StockNotPresentException {
		log.debug("START");
		
		List<Invoice> allEntries = invoiceDao.findAll();
		List<InvoiceEntry> returnList = new ArrayList<InvoiceEntry>();
		if(!allEntries.isEmpty()) {
			
			for(int i=0; i<allEntries.size(); i++) {
				Invoice invoice = allEntries.get(i);
				InvoiceEntry invoiceEntry = new InvoiceEntry();
				invoiceEntry.setDateOfSale(invoice.getDateOfSale());
				invoiceEntry.setInvoiceNumber(invoice.getInvoiceNumber());
				invoiceEntry.setModeOfPayment(invoice.getModeOfPayment());
				
				log.debug(invoice.getId() + " initailaised");
				
				Optional<Patient> patient = patientExchangeService.getPatientDetailsById(invoice.getP_id());
				if(!patient.isPresent()) {
					throw new PatientNotPresentException();
				}
				else {
					invoiceEntry.setPatient(patient.toString());
				}
				
				Optional<Stock> stock = stockExchangeService.getStockDetailsById(invoice.getM_id());
				if(!stock.isPresent()) {
					throw new StockNotPresentException();
				}
				else {
					invoiceEntry.setMedicine(stock.toString());
				}
				
				returnList.add(invoiceEntry);
			
			}
			
		}
		
		return returnList;
		
	}
}
