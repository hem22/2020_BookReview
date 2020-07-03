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
	
	@RequestMapping(path = "/list_book", method = RequestMethod.GET)
	public String listBook(ModelMap mm) {
		return "list_book";
	}
	
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String login(ModelMap mm) {
		return "login";
	}
	
	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String register(ModelMap mm) {
		return "register";
	}
	
	@RequestMapping(path = "/list_review", method = RequestMethod.GET)
	public String reviewList(ModelMap mm) {
		return "list_review";
	}
	
	@RequestMapping(path = "/add_author", method = RequestMethod.GET)
	public String Adduthor(ModelMap mm) {
		return "add_author";
	}
	
	@RequestMapping(path = "review_content", method = RequestMethod.GET)
	public String reviewContent(ModelMap mm) {
		return "review_content";
	}
}
