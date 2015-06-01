package org.hillel.it.easy.model.entity;

import java.util.Date;

public class Book extends BaseEntity {
	private String codeISBN;
	private String title;
	private String author;
	private int edition;
	private int yearOfPublication;
	private String publisher;
	private String language; // enum??
	private String briefReview;
	private int numberOfPages;
	private float price;
	private int weight;
	private int dimention;
	private int quantityInStock;

}
