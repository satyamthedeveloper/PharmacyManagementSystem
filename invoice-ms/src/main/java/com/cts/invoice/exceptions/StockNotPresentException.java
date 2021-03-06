package com.cts.invoice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Stock Entry not found")
public class StockNotPresentException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StockNotPresentException() {
		super("Stock Feign Exchange Service Error");
		log.debug("exception throwed");
	}

}
