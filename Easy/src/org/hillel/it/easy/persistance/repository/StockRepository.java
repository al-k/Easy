package org.hillel.it.easy.persistance.repository;
import org.hillel.it.easy.model.entity.Stock;


public interface StockRepository {
	boolean addStock(Stock stock);
	Stock getStockByID(int id);
	boolean updateStock(Stock stock);
	boolean deleteStock(Stock stock);
}
