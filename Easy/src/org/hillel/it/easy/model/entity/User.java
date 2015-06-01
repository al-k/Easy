package org.hillel.it.easy.model.entity;

import java.util.Date;

public class User extends BaseEntity {
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	private String email;
	private String password;
	private UserRole role; //enum??, not done yet

}
