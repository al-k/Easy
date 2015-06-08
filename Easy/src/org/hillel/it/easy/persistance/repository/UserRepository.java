package org.hillel.it.easy.persistance.repository;

import org.hillel.it.easy.model.entity.User;

public interface UserRepository {
	boolean addUser(User user);
	boolean updateUser(User user);
	User getUserByEmail(String userEmail);
	boolean deleteUser(User user);

}
