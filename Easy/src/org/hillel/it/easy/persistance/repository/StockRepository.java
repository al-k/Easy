package org.hillel.it.easy.persistance.repository;
import org.hillel.it.easy.model.entity.Stock;


public interface StockRepository {
	boolean add(Stock stock);
	boolean update(Stock stock);
	Stock getByID(int id);
	boolean delete(Stock stock);
}
