package ict.hoseo.bookreview;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
	
	Author findByName(String name);
	
	List<Book> findAll(Pageable page);
}
