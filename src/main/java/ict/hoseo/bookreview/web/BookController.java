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
	
	@RequestMapping(path = "/addbook", method = RequestMethod.GET)
	public String addForm(ModelMap mm) {
		mm.put("books", book_repo.findAll());
		return "books";
	}
	
	@RequestMapping(path = "/addbook", method = RequestMethod.POST)
	public String add(Book athors) {
		book_repo.save(athors);
		return "redirect:add_book";
	}
}
