package org.hillel.it.easy.model.entity;

import java.util.ArrayList;

public class ShoppingCart extends BaseEntity {
	private ArrayList<CartUnit> cartUnitsArray; // collection maybe ?
	private ShoppingCartStatus status; // enum 
	private User user;
	
	public ArrayList<CartUnit> getCartUnitsArray() {
		return cartUnitsArray;
	}
	public void setCartUnitsArray(ArrayList<CartUnit> cartUnitsArray) {
		this.cartUnitsArray = cartUnitsArray;
	}
	public ShoppingCartStatus getStatus() {
		return status;
	}
	public void setStatus(ShoppingCartStatus status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}