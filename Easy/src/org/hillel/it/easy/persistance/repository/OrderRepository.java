package org.hillel.it.easy.persistance.repository;

import org.hillel.it.easy.model.entity.Order;

public interface OrderRepository {
	boolean add(Order order);
	boolean update(Order order);
	Order getByID(int id);
	boolean delete(Order order);
}
