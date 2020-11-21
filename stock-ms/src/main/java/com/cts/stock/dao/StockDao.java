package com.cts.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.stock.model.Stock;

@Repository
public interface StockDao extends JpaRepository<Stock, Long>{

}
