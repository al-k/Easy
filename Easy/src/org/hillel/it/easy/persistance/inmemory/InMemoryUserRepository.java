package org.hillel.it.easy.persistance.inmemory;

import org.hillel.it.easy.model.entity.User;
import org.hillel.it.easy.persistance.repository.UserRepository;

public class InMemoryUserRepository extends InMemoryBaseRepository<User>
		implements UserRepository {
	
	@Override
	public User getByEmail(String userEmail) {
		for (User user : dBase) {
			if (userEmail.equals(user.getEmail())) {
				return user;
			}
		}
		return null;
	}

}
