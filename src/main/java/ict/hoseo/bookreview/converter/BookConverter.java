package ict.hoseo.bookreview.converter;

import java.util.concurrent.ConcurrentMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;

import ict.hoseo.bookreview.Book;
import ict.hoseo.bookreview.BookRepository;

@Component
public class BookConverter implements Converter<Integer, Book>{
	
	@Autowired
	private BookRepository book_repo;
	
	@Override
	public Book convert(Integer source) {
		return book_repo.findById(source).get();
	}
}
