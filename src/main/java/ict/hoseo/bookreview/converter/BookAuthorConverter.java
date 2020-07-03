package ict.hoseo.bookreview.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;

import ict.hoseo.bookreview.BookAuthor;
import ict.hoseo.bookreview.BookAuthorRepository;

@Component
public class BookAuthorConverter implements Converter<Integer, BookAuthor>{
	@Autowired
	private BookAuthorRepository ba_repo;
	
	@Override
	public BookAuthor convert(Integer source) {
		return ba_repo.findById(source).get();
	}
}
