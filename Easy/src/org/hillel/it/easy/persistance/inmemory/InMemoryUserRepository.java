package org.hillel.it.easy.persistance.inmemory;

import org.hillel.it.easy.model.entity.User;
import org.hillel.it.easy.persistance.repository.UserRepository;

public class InMemoryUserRepository implements UserRepository {

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUserByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
