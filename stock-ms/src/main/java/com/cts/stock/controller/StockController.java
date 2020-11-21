package com.cts.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.stock.services.StockService;

@RestController
@RequestMapping(value = "/stock")
public class StockController {

	@Autowired
	private StockService stockService;
	
	@GetMapping
	String hello() {
		return "Welcome to Pharmacy Stocks";
	}
	
	
}
