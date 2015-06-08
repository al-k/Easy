package org.hillel.it.easy.persistance.repository;
import org.hillel.it.easy.model.entity.Stock;


public interface StockRepository {
	boolean saveStock(Stock stock);
	Stock getStockByID(int id);
	boolean deleteStock(Stock stock);
}
