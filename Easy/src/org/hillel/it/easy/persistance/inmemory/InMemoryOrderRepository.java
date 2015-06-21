package org.hillel.it.easy.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.easy.model.entity.Order;
import org.hillel.it.easy.persistance.repository.OrderRepository;

public class InMemoryOrderRepository implements OrderRepository {
	List<Order> orders = new ArrayList<>();
	private int currentID;
	
	@Override
	public boolean addOrder(Order order) {
		if (order == null) {
			return false;
		}
		if (-1 == orders.indexOf(order)) {
			order.setID(currentID + 1);
			if (orders.add(order)) {
				currentID++;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateOrder(Order order) {
		if (order == null) {
			return false;
		}
		int orderIndex = orders.indexOf(order);
		if (-1 != orderIndex) {
			orders.set(orderIndex, order);
			return true;
		}
		return false;
	}

	@Override
	public Order getOrderByID(int id) {
		for (Order order : orders) {
			if (id == order.getID()) {
				return order;
			}
		}
		return null;
	}

	@Override
	public boolean deleteOrder(Order order) {
		return orders.remove(order);
	}

}
