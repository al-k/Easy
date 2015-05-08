package org.hillel.it.easy.model.entity;

import java.util.Date;

public class Book {
	private final int id;
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
	private Date lastEditedOn;
	private User lastEditedBy;

	public Book addBook(String name, String position, int permition) {
		Book book = new Book();
		return book;
	}

	public boolean deleteBook(int id) {
		return true;
	}

}
