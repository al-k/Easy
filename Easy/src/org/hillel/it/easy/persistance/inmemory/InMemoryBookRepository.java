package org.hillel.it.easy.persistance.inmemory;

import org.hillel.it.easy.model.entity.Book;
import org.hillel.it.easy.persistance.repository.BookRepository;

public class InMemoryBookRepository extends InMemoryBaseRepository<Book>
		implements BookRepository {
}
