package org.hillel.it.easy.model.entity;

public abstract class Product {
	private int id;
	private String name;
	private String briefReview;
	private int quantity;
	private int weight;
	private int dimention;

	public int numberOfPronuctAvailable() {
		
		return -1;
	}
}
