package ict.hoseo.bookreview;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
	
	List<Author> findByName(String author);
	
}
