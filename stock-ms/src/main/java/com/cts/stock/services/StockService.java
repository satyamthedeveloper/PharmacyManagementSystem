package com.cts.stock.services;

import java.util.List;
import java.util.Optional;

import com.cts.stock.model.Stock;

public interface StockService {

	List<Stock> getAllStockDetails();

	Optional<Stock> getStockDetailsById(long id);

	boolean addStock(Stock stock);

}
