package org.hillel.it.easy.persistance.repository;

import org.hillel.it.easy.model.entity.User;

public interface UserRepository {
	boolean add(User user);
	boolean update(User user);
	User getByEmail(String userEmail);
	boolean delete(User user);

}
