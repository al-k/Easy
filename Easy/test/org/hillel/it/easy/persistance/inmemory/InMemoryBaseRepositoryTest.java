package org.hillel.it.easy.persistance.inmemory;

import static org.junit.Assert.*;

import org.hillel.it.easy.model.entity.User;
import org.hillel.it.easy.model.entity.UserRole;
import org.junit.Before;
import org.junit.Test;

public class InMemoryBaseRepositoryTest {
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
	public void testAddPos() {
		assertTrue(userRep.add(user2));
	}
	
	@Test
	public void testAddNeg() {
		userRep.add(user2);
		assertFalse(userRep.add(user2));
	}

	@Test
	public void testUpdatePos() {
		user.setFirstName("Al");
		assertTrue(userRep.update(user));
	}
	
	@Test
	public void testUpdateNeg() {
		assertFalse(userRep.update(user2));
	}

	@Test
	public void testGetByEmailPos() {
		assertEquals(user1, userRep.getByEmail("a1@a.com"));
	}
	
	@Test
	public void testGetByEmailNeg() {
		assertNotEquals(user1, userRep.getByEmail("a122@a.com"));
	}

	@Test
	public void testDeletePos() {
		assertTrue(userRep.delete(user));
	}

	@Test
	public void testDeleteNeg() {
		assertFalse(userRep.delete(user2));
	}

}
