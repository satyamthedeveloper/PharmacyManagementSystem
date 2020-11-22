package com.cts.stock.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.stock.model.Stock;
import com.cts.stock.services.StockService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/")
@Slf4j
public class StockController {

	@Autowired
	private StockService stockService;
	
	// Returns list of all patients
		@GetMapping
		public ResponseEntity<?> getAllStockDetails() {
			log.info("START");
			List<Stock> stockList = stockService.getAllStockDetails();
			log.debug("stockList Data Received");
			if(stockList.isEmpty()) {
				return new ResponseEntity<String>("No Stock", HttpStatus.OK);
			}
			
			return new ResponseEntity<List<Stock>>(stockList, HttpStatus.OK);
		}
		
		// Returns patient details of given id if exists
		@GetMapping("{id}")
		public ResponseEntity<?> getStockDetailsById(@PathVariable("id") long id) {
			log.debug("START");
			Optional<Stock> stock = stockService.getStockDetailsById(id);
			log.debug("stock Data Received");
			if(!stock.isPresent()) {
				return new ResponseEntity<String>("Stock Id does not exist.", HttpStatus.OK);
			}
			
			return new ResponseEntity<Optional<Stock>>(stock, HttpStatus.OK);
		}
		
		// Add new Patient
		@PostMapping()
		public ResponseEntity<?> addPatientDetails(@RequestBody Stock stock){
			log.debug("START");
			boolean success = stockService.addStock(stock);
			log.debug("Service implemented");
			if(!success)
				return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	
	
}
