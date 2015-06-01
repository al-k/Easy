package org.hillel.it.easy.model.entity;

import java.util.ArrayList;

public class ShoppingCart extends BaseEntity {
	private ArrayList<CartUnit> cartUnitsArray; // collection maybe ?
	private int status; // enum? active-confirmed-toGarbage
	private User user;
}