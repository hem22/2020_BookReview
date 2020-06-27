package ict.hoseo.bookreview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;


@SpringBootTest 
public class ReviewBookTest {
	
	
	@Autowired
	private BookRepository bookRepo;

	@Autowired
	private AuthorRepository authorRepo;

	@Autowired
	private BookAuthorRepository bookAuthorRepo;
	
	@Autowired
	private ReviewRepository reviewRepo;
	
	@Autowired
	private UserRepository userRepo;

	

	@Test
	@Rollback(false)
	public void test() {
		Author a1 = Author.builder().name("박교수").build();
		Author a2 = Author.builder().name("김교수").build();
		Book b = Book.builder().isbn("1234").title("기묘한모험").build();
		BookAuthor ba = BookAuthor.builder().book(b).author(a1).build();
		
		bookRepo.save(b);
		authorRepo.save(a1);
		bookAuthorRepo.save(ba);
		bookAuthorRepo.save(BookAuthor.builder().book(b).author(a2).build());
		
//		User u1 = User.builder().id("test123").password("password").name("김혜미").build();
//		User u2 = User.builder().id("test456").password("password").name("기매미").build();
//		Review r1 = Review.builder().grade(5).content("매우 재미있었어요 추천합니다 꼭읽어보시길").build();
//		Review r2 = Review.builder().grade(1).content("노잼").build();
//		BookReview br = BookReview.builder().book(b).user(u1).build();
//		
//		userRepo.save(u1);
//		userRepo.save(u2);
//		reviewRepo.save(r1);
//		reviewRepo.save(r2);
//		bookReviewRepo.save(br);
	
		
		assertEquals(2, bookRepo.findById(1).get().getAuthors().size());
		//assertEquals(2, reviewRepo.count());
	}
}
