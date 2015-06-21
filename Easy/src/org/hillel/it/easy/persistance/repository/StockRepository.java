package org.hillel.it.easy.persistance.repository;
import org.hillel.it.easy.model.entity.Stock;


public interface StockRepository {
	boolean addStock(Stock stock);
	boolean updateStock(Stock stock);
	Stock getStockByID(int id);
	boolean deleteStock(Stock stock);
}
