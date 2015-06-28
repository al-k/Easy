package org.hillel.it.easy.service.impl;

import org.hillel.it.easy.model.entity.Order;
import org.hillel.it.easy.model.entity.User;
import org.hillel.it.easy.persistance.inmemory.InMemoryOrderRepository;
import org.hillel.it.easy.persistance.inmemory.InMemoryUserRepository;
import org.hillel.it.easy.persistance.repository.OrderRepository;
import org.hillel.it.easy.persistance.repository.UserRepository;
import org.hillel.it.easy.service.UserService;

public class UserServiceImpl implements UserService {
	private UserRepository dBaseUser = new InMemoryUserRepository();
	private OrderRepository dBaseOrder = new InMemoryOrderRepository();

	@Override
	public User login(String userEmail, String password) {
		User user =	dBaseUser.getByEmail(userEmail);
		if (user!= null) {
			if (user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public boolean registration(User user) {
		return dBaseUser.add(user);
	}

	@Override
	public boolean addOrder(Order order) {
		return dBaseOrder.add(order);
	}

	@Override
	public boolean updateOrder(Order order) {
		return dBaseOrder.update(order);
	}

}
