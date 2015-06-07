package org.hillel.it.easy.persistance.repository;

import org.hillel.it.easy.model.entity.User;

public interface UserRepository {
	boolean addUser(User user);
	User getUserByID(int id);
	boolean updateUser(User user);
	boolean deleteUser(User user);

}
