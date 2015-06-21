package org.hillel.it.easy.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.easy.model.entity.Book;
import org.hillel.it.easy.persistance.repository.BookRepository;

public class InMemoryBookRepository implements BookRepository {
	List<Book> books = new ArrayList<>();
	private int currentID;

	@Override
	public boolean addBook(Book book) {
		if (book == null) {
			return false;
		}
		if (-1 == books.indexOf(book)) {
			book.setID(currentID + 1);
			if (books.add(book)) {
				currentID++;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateBook(Book book) {
		if (book == null) {
			return false;
		}
		int bookIndex = books.indexOf(book);
		if (-1 != bookIndex) {
			books.set(bookIndex, book);
			return true;
		}
		return false;
	}

	@Override
	public Book getBookByID(int id) {
		for (Book book : books) {
			if (id == book.getID()) {
				return book;
			}
		}
		return null;
	}

	@Override
	public boolean deleteBook(Book book) {
		return books.remove(book);
	}

}
