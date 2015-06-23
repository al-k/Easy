package org.hillel.it.easy.persistance.inmemory;

import org.hillel.it.easy.model.entity.Stock;
import org.hillel.it.easy.persistance.repository.StockRepository;

public class InMemoryStockRepository extends InMemoryBaseRepository<Stock>
		implements StockRepository {
}
