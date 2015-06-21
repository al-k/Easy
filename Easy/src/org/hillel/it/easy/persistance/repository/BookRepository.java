package org.hillel.it.easy.persistance.repository;

import org.hillel.it.easy.model.entity.Book;

public interface BookRepository {
	boolean addBook(Book book);
	boolean updateBook(Book book);
	Book getBookByID(int id);
	boolean deleteBook(Book book);
}
