package org.hillel.it.easy.model.entity;

import java.util.List;

public class Stock extends BaseEntity {
	private List<Book> bookList;
	private String name;
	private String address;
	
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
}
//