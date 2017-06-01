package org.test.book.pub.entity;

import org.test.book.pub.entity.Book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by jin80 on 6/1/2017.
 */

@Entity
public class Publisher {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "publisher")
    private List<Book> books;

    protected Publisher(){}

    public Publisher(String name){
        this.name = name;
    }
}
