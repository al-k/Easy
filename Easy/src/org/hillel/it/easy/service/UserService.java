package org.hillel.it.easy.service;

import org.hillel.it.easy.model.entity.Order;
import org.hillel.it.easy.model.entity.User;

public interface UserService{
	User login(String UserEmail, String password);
	boolean registration( User user);
	boolean addOrder(Order order);
	boolean updateOrder(Order order);	

}
