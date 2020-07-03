package ict.hoseo.bookreview;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Pageable;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String>{ 
	
	User findAll(Pageable page);
	
}
