package org.hillel.it.easy.persistence;

public interface OrderRepository {
	boolean addOrder(Order order);
	Order getOrderByID(int id);
	boolean updateOrder(Order order);
	boolean deleteOrder(Order order);
}
