package ict.hoseo.bookreview.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ict.hoseo.bookreview.Book;
import ict.hoseo.bookreview.BookRepository;

@Controller
public class BookController {

	@Autowired
	private BookRepository book_repo;
	
	@RequestMapping(path = "/addBook", method = RequestMethod.GET)
	public String addbookF(ModelMap aa) {
		aa.put("book", book_repo.findAll());
		return "book";
	}
	
	@RequestMapping(path = "/addBook", method = RequestMethod.POST)
	public String addB(Book book) {
		book_repo.save(book);
		return "redirect:list_book";
	}
	
}
