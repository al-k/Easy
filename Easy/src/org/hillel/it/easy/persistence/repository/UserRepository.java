package org.hillel.it.easy.persistence.repository;

public interface UserRepository {
	boolean addUser(User user);
	User getUserByID(int id);
	boolean updateUser(User user);
	boolean deleteUser(User user);

}
