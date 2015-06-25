package org.hillel.it.easy.service;

import org.hillel.it.easy.persistance.repository.UserRepository;

public interface UserService extends UserRepository{
	public boolean login(String email);
	public boolean registration(String email);
	

}
