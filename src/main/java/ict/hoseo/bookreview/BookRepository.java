package ict.hoseo.bookreview;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer>{
	
	List<Book> findAll(Pageable page);
	//List<Book> findByTitleContains(String title);
	List<Book> findByTitleEndsWith(String title);
}



//public class BookRepository {
//	
//	@Autowired
//	private JdbcTemplate template;
//	
//	/**
//	 * 책을 저장(기존에 ID에 해당하는 책이 있으면 저장하지 않음)
//	 * @param book 저장할 책 정보
//	 * @return 책이 존재하면 false 저장실패, 책이 없다면 책을 추가하고 true 
//	 */
//	public boolean save(Book book) {
//		try {
//			template.update("insert into Book values(?, ?, ?, ?)",
//					book.getId(), book.getIsbn(), book.getTitle(), book.getPrice());
//			// TODO 저자를 저장
//			for(Author author : book.getAuthor()){
//				// 저자 다 넣음
//				template.update("insert into Author values(?,?)",
//						author.getId(), author.getAuthor());
//				
//				template.update("insert into Author_Book values(?,?)",
//						author.getId(), book.getId());
//			}	
//		}catch(DataAccessException dae) {
//			log.error("책 추가 실패", dae);
//			return false;
//		}
//		return true;
//	}
//	
//	/**
//	 * 책을 update
//	 * @param book 저장할 책 정보
//	 * @return 책의 id와 같지 않을때는 변경 X
//	 */
//	
//	public boolean update(Book book) {
//		try {
//			template.update("update Book set Isbn = ?, title = ?, price = ? where id = ?",
//					book.getIsbn(), book.getTitle(), book.getPrice(), book.getId());
//			for(Author author : book.getAuthor()){
//				// 저자 다 넣음
//				template.update("upate Author set ",
//						author.getId(), author.getAuthor());
//				
//				template.update("insert into Author_Book values(?,?)",
//						author.getId(), book.getId());
//			}	
//		}catch(DataAccessException dae) {
//			log.error("책 업데이트 실패", dae);
//			return false;
//		}
//		return true;
//	}
//	
//	/**
//	 * 책 목록을 반환
//	 * @return 책 전체 목록을 반환
//	 */
//	public List<Book> list(){
//		return template.query("select * from book", 
//				new BeanPropertyRowMapper<Book>(Book.class));
//	}
//	
//	/**
//	 * 책 삭제
//	 * @param id
//	 * @return 책삭제가 성공하면 true 아니면 false
//	 */
//	
//	public boolean delete(String id) {
//		//TODO 아래 예외문을 삭제하고 구현하세요.
//		template.update("delete from Book where id = ?", id);
//			return true;
//	}
//
//	/**
//	 * 책 목록에서 책을 검색
//	 * @param title 검색하고자하는 키워드(like 검색)
//	 * @return 검색된 책 목록(null은 리턴하지 않음)
//	 */
//	public List<Book> searchByTitle(String title){
//		return(template.queryForList("select * from Book where title like '%?%'",
//				Book.class));
//	}
//
//}

