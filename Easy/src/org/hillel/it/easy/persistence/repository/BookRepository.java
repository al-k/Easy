package org.hillel.it.easy.persistence;

public interface BookRepository {
	boolean addBook(Book book);
	Book getBookByID(int id);
	boolean updateBook(Book book);
	boolean deleteBook(Book book);
}
