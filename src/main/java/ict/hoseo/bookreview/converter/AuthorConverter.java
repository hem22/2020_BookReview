package ict.hoseo.bookreview.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;

import ict.hoseo.bookreview.AuthorRepository;
import ict.hoseo.bookreview.Author;

@Component
public class AuthorConverter implements Converter<String, Author>{
	
	@Autowired
	private AuthorRepository author_repo;
	
	@Override
	public Author convert(String source) {
		return author_repo.findByName(source);
	}
}
