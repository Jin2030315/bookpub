package org.test.book.pub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.book.pub.entity.Book;

/**
 * Created by jin80 on 6/1/2017.
 */

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
     Book findBookByIsbn(String isbn);
}
