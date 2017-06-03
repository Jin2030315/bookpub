package org.test.book.pub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.test.book.pub.entity.Book;
import org.test.book.pub.entity.Reviewer;
import org.test.book.pub.property.editor.Isbn;
import org.test.book.pub.repository.BookRepository;

import java.util.List;

/**
 * Created by jin80 on 6/1/2017.
 */

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @RequestMapping(value = "/{isbn}",method = RequestMethod.GET)
    public Book getBook(@PathVariable("isbn") Isbn isbn){
        return bookRepository.findBookByIsbn(isbn.getIsbn());
    }

    @RequestMapping(value="/{isbn}/reviewers",method = RequestMethod.GET)
    public List<Reviewer> getReviewers(@PathVariable("isbn") Book book){
        return book.getReviewers();
    }
}