package org.test.bookpub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.bookpub.entity.Book;

/**
 * Created by jin80 on 6/1/2017.
 */

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
     public Book findBookByIsbn(String isbn);
}
