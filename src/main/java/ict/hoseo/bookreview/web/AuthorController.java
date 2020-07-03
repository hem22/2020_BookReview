package ict.hoseo.bookreview.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ict.hoseo.bookreview.Author;
import ict.hoseo.bookreview.AuthorRepository;

@Controller
public class AuthorController {
	
	@Autowired
	private AuthorRepository author_repo;
	
	@RequestMapping(path = "/addAuthor", method = RequestMethod.GET)
	public String addAuthorF(ModelMap mm) {
		mm.put("author", author_repo.findAll());
		return "author";
	}
	
	@RequestMapping(path = "/addAuthor", method = RequestMethod.POST)
	public String addA(Author author) {
		author_repo.save(author);
		return "redirect:add_author";
	}
}
