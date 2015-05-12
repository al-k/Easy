package org.hillel.it.easy.model.entity;

import java.util.Date;

public class Book extends BaseEntity {
	private String codeISBN;
	private String title;
	private String author;
	private int edition;
	private int yearOfPublication;
	private String publisher;
	private String language; // think about integer?
	private String briefReview;
	private int numberOfPages;
	private int numberOfCopies;
	private int quantity;
	private int weight;
	private int dimention;
	private float price;

	public Book addBook(String name, String position, int permition) {
		Book book = new Book();
		return book;
	}

	public boolean deleteBook(int id) {
		return true;
	}

}
