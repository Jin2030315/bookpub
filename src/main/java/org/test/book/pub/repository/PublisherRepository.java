package org.test.book.pub.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.test.book.pub.entity.Publisher;

/**
 * Created by jin80 on 6/2/2017.
 */
@RepositoryRestResource
public interface PublisherRepository extends PagingAndSortingRepository<Publisher,Long> {
}
