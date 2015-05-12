package org.hillel.it.easy.model.entity;

import java.util.Date;

public class User extends BaseEntity {
	private String name;
	private String position;
	private int permition;

	public User addUser(String name, String position, int permition) {
		User user = new User();
		return user;
	}

	public boolean deleteUser(User user) {
		return true;
	}

}
