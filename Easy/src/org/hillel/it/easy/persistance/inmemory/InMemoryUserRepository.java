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
		if (-1 == users.indexOf(user)) {
			user.setID(currentID + 1);
			if (users.add(user)) {
				currentID++;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		if (user == null) {
			return false;
		}
		int userIndex = users.indexOf(user);
		if (-1 != userIndex) {
			users.set(userIndex, user);
			return true;
		}
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
