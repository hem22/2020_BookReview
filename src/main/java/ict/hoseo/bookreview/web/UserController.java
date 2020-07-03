package ict.hoseo.bookreview.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ict.hoseo.bookreview.User;
import ict.hoseo.bookreview.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository user_repo;
	
	@RequestMapping(path = "/addUser", method = RequestMethod.GET)
	public String addUserF(ModelMap aa) {
		aa.put("user", user_repo.findAll());
		return "user";
	}
	
	@RequestMapping(path = "/addUser", method = RequestMethod.POST)
	public String addB(User user) {
		user_repo.save(user);
		return "redirect:index";
	}
}
