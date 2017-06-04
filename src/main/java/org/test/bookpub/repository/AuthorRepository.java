package org.test.bookpub.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.test.bookpub.entity.Author;

/**
 * Created by jin80 on 6/2/2017.
 */
@RepositoryRestResource(collectionResourceRel = "writers", path = "writers")
//@RepositoryRestResource
public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {
}


