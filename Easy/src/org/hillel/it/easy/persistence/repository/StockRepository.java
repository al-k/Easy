
public interface StockRepository {
	boolean addStock(Stock stock);
	Stock getStockByID(int id);
	boolean updateStock(Stock stock);
	boolean deleteStock(Stock stock);
}
