package org.hillel.it.easy.model.entity;

import java.util.Date;

public class User {
	private final int id;
	private String name;
	private String position;
	private int permition;
	private Date lastEditedOn;
	private User lastEditedBy;

	public User addUser(String name, String position, int permition) {
		User user = new User();
		return user;
	}

	public boolean deleteUser(User user) {
		return true;
	}

}
