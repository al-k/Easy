package org.hillel.it.easy.model.entity;

public class Book extends BaseEntity {
	private String codeISBN;
	private String title;
	private String author;
	private int edition;
	private int yearOfPublication;
	private String publisher;
	private Language language; // enum, is it worth?
	private String briefReview;
	private int numberOfPages;
	private float price;
	private int weight;
	private int dimention;
	private int quantityInStock;
	public String getCodeISBN() {
		return codeISBN;
	}
	public void setCodeISBN(String codeISBN) {
		this.codeISBN = codeISBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public String getBriefReview() {
		return briefReview;
	}
	public void setBriefReview(String briefReview) {
		this.briefReview = briefReview;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getDimention() {
		return dimention;
	}
	public void setDimention(int dimention) {
		this.dimention = dimention;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	
}
