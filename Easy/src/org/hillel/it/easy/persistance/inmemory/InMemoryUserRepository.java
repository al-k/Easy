package org.hillel.it.easy.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.easy.model.entity.User;
import org.hillel.it.easy.persistance.repository.UserRepository;

public class InMemoryUserRepository implements UserRepository {
	List<User> users = new ArrayList<>();
	private int currentID;

	@Override
	public boolean addUser(User user) {
		if (user == null) {
			return false;
		}
		if (!isUserExist(user)) {
			user.setID(currentID+1);
			if (users.add(user)) {
				currentID++;
				return true;
			}
		}
		return false;
	}

	private boolean isUserExist(User user) {
		return getUserByEmail(user.getEmail()) == null;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUserByEmail(String userEmail) {
		for (User user : users) {
			if (userEmail.equals(user.getEmail())) {
				return user;
			}
		}
		return null;
	}

	@Override
	public boolean deleteUser(User user) {
		return users.remove(user);
	}

}
