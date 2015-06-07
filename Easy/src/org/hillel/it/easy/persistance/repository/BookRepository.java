package org.hillel.it.easy.persistance.repository;

import org.hillel.it.easy.model.entity.Book;

public interface BookRepository {
	boolean addBook(Book book);
	Book getBookByID(int id);
	boolean updateBook(Book book);
	boolean deleteBook(Book book);
}
