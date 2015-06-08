package org.hillel.it.easy.persistance.repository;

import org.hillel.it.easy.model.entity.Order;

public interface OrderRepository {
	boolean saveOrder(Order order);
	Order getOrderByID(int id);
	boolean deleteOrder(Order order);
}
