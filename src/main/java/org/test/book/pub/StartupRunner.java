package org.test.book.pub;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.test.book.pub.entity.Author;
import org.test.book.pub.entity.Book;
import org.test.book.pub.entity.Publisher;
import org.test.book.pub.repository.AuthorRepository;
import org.test.book.pub.repository.BookRepository;
import org.test.book.pub.repository.PublisherRepository;


/**
 * Created by jin80 on 6/1/2017.
 */
public class StartupRunner implements CommandLineRunner {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    /*@Autowired
    private DataSource ds;*/

    @Override
    public void run(String... strings) throws Exception {
       // logger.info("DataSources: "+ ds.toString());
        logger.info("Number of books: " + bookRepository.count());
        Author author = new Author("Alex","Antonov");
        author = authorRepository.save(author);
        Publisher publisher = new Publisher("Packt");
        publisher = publisherRepository.save(publisher);
        Book book = new Book("978-78528-415-1","Spring boot Recipes",author,publisher);
        bookRepository.save(book);
    }

    @Scheduled(initialDelay = 1000,fixedRate =10000)
    public void run(){
        logger.info("Number of books:" + bookRepository.count());
    }

}

