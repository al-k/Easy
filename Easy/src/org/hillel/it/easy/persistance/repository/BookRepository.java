package org.hillel.it.easy.persistance.repository;

import org.hillel.it.easy.model.entity.Book;

public interface BookRepository {
	boolean add(Book book);
	boolean update(Book book);
	Book getByID(int id);
	boolean delete(Book book);
}
