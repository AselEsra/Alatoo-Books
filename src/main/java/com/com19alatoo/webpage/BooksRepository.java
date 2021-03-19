package com.com19alatoo.webpage;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BooksRepository extends CrudRepository<Books, Integer> {

}

