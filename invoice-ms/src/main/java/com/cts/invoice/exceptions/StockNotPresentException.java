package com.cts.invoice.exceptions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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
