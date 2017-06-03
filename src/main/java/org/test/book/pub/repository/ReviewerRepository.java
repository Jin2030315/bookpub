package org.test.book.pub.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.test.book.pub.entity.Reviewer;

/**
 * Created by jin80 on 6/2/2017.
 */
public interface ReviewerRepository extends PagingAndSortingRepository<Reviewer,Long> {
}
