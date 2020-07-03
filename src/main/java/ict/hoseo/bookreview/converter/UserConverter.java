package ict.hoseo.bookreview.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;


import ict.hoseo.bookreview.User;
import ict.hoseo.bookreview.UserRepository;

@Component
public class UserConverter implements Converter<String, User>{
	
	@Autowired
	private UserRepository user_repo;
	
	@Override
	public User convert(String source) {
		return user_repo.findById(source).get();
	}
}
