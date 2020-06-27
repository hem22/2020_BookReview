package ict.hoseo.bookreview.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String main(ModelMap mm) {
		return "index";
	}
	
	@RequestMapping(path = "/add_book", method = RequestMethod.GET)
	public String addBook(ModelMap mm) {
		return "add_book";
	}
	
	@RequestMapping(path = "/add_review", method = RequestMethod.GET)
	public String addReview(ModelMap mm) {
		return "add_review";
	}
}
