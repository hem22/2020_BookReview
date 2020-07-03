package ict.hoseo.bookreview.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ict.hoseo.bookreview.Review;
import ict.hoseo.bookreview.ReviewRepository;

@Controller
public class Reviewcontroller {
	
	@Autowired
	private ReviewRepository re_repo;
	
	@RequestMapping(path = "/addReview", method = RequestMethod.GET)
	public String addReviewF(ModelMap mm) {
		mm.put("review", re_repo.findAll());
		return "review";
	}
	
	@RequestMapping(path = "/addReview", method = RequestMethod.POST)
	public String add(Review review) {
		re_repo.save(review);
		return "redirect:list_review";
	}
}
