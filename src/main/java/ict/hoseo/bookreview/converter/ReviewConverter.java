package ict.hoseo.bookreview.converter;

import ict.hoseo.bookreview.Review;
import ict.hoseo.bookreview.ReviewRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;

@Component
public class ReviewConverter implements Converter<Integer, Review>{
		
	@Autowired
	private ReviewRepository re_repo;
	
	@Override
	public Review convert(Integer source) {
		return re_repo.findById(source).get();
	}
}
