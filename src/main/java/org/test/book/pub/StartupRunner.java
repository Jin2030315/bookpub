package org.test.book.pub;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.test.book.pub.repository.BookRepository;


/**
 * Created by jin80 on 6/1/2017.
 */
public class StartupRunner implements CommandLineRunner {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    public BookRepository bookRepository;

    /*@Autowired
    private DataSource ds;*/

    @Override
    public void run(String... strings) throws Exception {
       // logger.info("DataSources: "+ ds.toString());
        logger.info("Number of books: " + bookRepository.count());
    }

    @Scheduled(initialDelay = 1000,fixedRate =10000)
    public void run(){
        logger.info("Number of books:" + bookRepository.count());
    }

}

