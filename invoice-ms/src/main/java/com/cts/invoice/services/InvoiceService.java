package com.cts.invoice.services;

import java.util.List;

import com.cts.invoice.exceptions.PatientNotPresentException;
import com.cts.invoice.exceptions.StockNotPresentException;
import com.cts.invoice.model.InvoiceEntry;

public interface InvoiceService {

	List<InvoiceEntry> getAllDetails() throws PatientNotPresentException, StockNotPresentException;

}
