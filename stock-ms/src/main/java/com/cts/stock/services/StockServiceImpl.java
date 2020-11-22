package com.cts.stock.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.stock.dao.StockDao;
import com.cts.stock.model.Stock;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StockServiceImpl implements StockService {
	
	@Autowired
	private StockDao stockDao;

	// returns List of stocks
	@Override
	public List<Stock> getAllStockDetails() {
		log.debug("START");
		return stockDao.findAll();
	}

	//return stock by id
	@Override
	public Optional<Stock> getStockDetailsById(long id) {
		log.debug("START");
		return stockDao.findById(id);
	}

	//insert stock in db
	@Override
	public boolean addStock(Stock stock) {
		log.debug("START");
		if(stockDao.save(stock) != null) {
			return true;
		}
		
		return false;
	}

}
