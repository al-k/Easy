package org.hillel.it.easy.persistance.inmemory;

import static org.junit.Assert.*;

import org.hillel.it.easy.model.entity.User;
import org.hillel.it.easy.model.entity.UserRole;
import org.junit.Before;
import org.junit.Test;

public class InMemoryUserRepositoryTest {
	InMemoryUserRepository userRep = new InMemoryUserRepository();
	User user = new User();
	User user1 = new User();
	User user2 = new User();
	UserRole userRole = UserRole.ADMIN;
	UserRole userRole1 = UserRole.STOCKMAN;

	@Before
	public void setUp() throws Exception {
		user.setAddress("Odessa");
		user.setEmail("a@a.com");
		user.setFirstName("Alex");
		user.setLastName("K");
		user.setPhone("050");
		user.setPassword("abc");
		user.setRole(userRole);

		user1.setAddress("Odessa1");
		user1.setEmail("a1@a.com");
		user1.setFirstName("Alex1");
		user1.setLastName("Ku1");
		user1.setPhone("0501");
		user1.setPassword("abc1");
		user1.setRole(userRole1);

		userRep.add(user);
		userRep.add(user1);
	}

	@Test
	public void testAddUser() {
		assertTrue(userRep.add(user2));
	}

	@Test
	public void testUpdateUser() {
		user.setFirstName("Al");
		assertTrue(userRep.update(user));
	}

	@Test
	public void testGetUserByEmail() {
		assertEquals(user1, userRep.getByEmail("a1@a.com"));
	}

	@Test
	public void testDeleteUser() {
		assertTrue(userRep.delete(user));
	}

	@Test
	public void testDeleteUserNeg() {
		assertTrue(!userRep.delete(user2));
	}

}
