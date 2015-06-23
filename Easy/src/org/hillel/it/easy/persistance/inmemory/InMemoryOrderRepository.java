package org.hillel.it.easy.persistance.inmemory;

import org.hillel.it.easy.model.entity.Order;
import org.hillel.it.easy.persistance.repository.OrderRepository;

public class InMemoryOrderRepository extends InMemoryBaseRepository<Order>
		implements OrderRepository {
}