package com.cts.stock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.stock.dao.StockDao;
import com.cts.stock.model.Stock;
import com.cts.stock.services.StockServiceImpl;

@SpringBootTest
class StockMsApplicationTests {

	@InjectMocks
	StockServiceImpl stockServiceMock;

	@Mock
	StockDao stockDaoMock;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetAllStockDetails() {
		List<Stock> demoList = new ArrayList<Stock>();
		demoList.add(new Stock(11, "PCM", 45, new Date(2017, 05, 05), new Date(2019, 05, 05), "cipla"));
		when(stockDaoMock.findAll()).thenReturn(demoList);
		List<Stock> result = stockServiceMock.getAllStockDetails();
		assertEquals(demoList, result);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetStockDetailsById() {
		Optional<Stock> stock = Optional
				.of(new Stock(11, "PCM", 45, new Date(2017, 05, 05), new Date(2019, 05, 05), "cipla"));
		long id = 11;
		when(stockDaoMock.findById(id)).thenReturn(stock);
		Optional<Stock> result = stockServiceMock.getStockDetailsById(11);
		assertEquals(stock, result);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAddStock() {
		Stock stock = new Stock(11, "PCM", 45, new Date(2017, 05, 05), new Date(2019, 05, 05), "cipla");
		stockServiceMock.addStock(stock);
		
		verify(stockDaoMock, times(1)).save(stock);
		
	}

}
