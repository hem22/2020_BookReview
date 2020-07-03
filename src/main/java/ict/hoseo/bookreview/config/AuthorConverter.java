package ict.hoseo.bookreview.config;

import java.util.concurrent.ConcurrentMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;

import ict.hoseo.bookreview.AuthorRepository;
import ict.hoseo.bookreview.Author;

@Component
public class AuthorConverter implements Converter<Integer, Author>{
	@Autowired
	private AuthorRepository author_repo;
	
	@Override
	public Author convert(Integer source) {
		return author_repo.findById(source).get();
	}
}
