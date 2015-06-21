package org.hillel.it.easy.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.easy.model.entity.Stock;
import org.hillel.it.easy.persistance.repository.StockRepository;

public class InMemoryStockRepository implements StockRepository {
	List<Stock> stocks = new ArrayList<>();
	private int currentID;
	
	@Override
	public boolean addStock(Stock stock) {
		if (stock == null) {
			return false;
		}
		if (-1 == stocks.indexOf(stock)) {
			stock.setID(currentID + 1);
			if (stocks.add(stock)) {
				currentID++;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateStock(Stock stock) {
		if (stock == null) {
			return false;
		}
		int stockIndex = stocks.indexOf(stock);
		if (-1 != stockIndex) {
			stocks.set(stockIndex, stock);
			return true;
		}
		return false;
	}

	@Override
	public Stock getStockByID(int id) {
		for (Stock stock : stocks) {
			if (id == stock.getID()) {
				return stock;
			}
		}
		return null;
	}

	@Override
	public boolean deleteStock(Stock stock) {
		return stocks.remove(stock);
	}

}
