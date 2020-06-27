package ict.hoseo.bookreview;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Review {
	@Id
	@GeneratedValue(generator = "seq_review", strategy = GenerationType.AUTO)
	@Column(name="review_id")
	private Integer id;
	
	// 리뷰대상 책
	@OneToMany(mappedBy = "review", fetch = FetchType.EAGER)
	private List<Book> book = new ArrayList<Book>();
	
	// 별점(1-5점, 1점 단위)
	@Column(length = 1, nullable = false)
	private int grade;
	
	// 실제 리뷰
	@Column(length = 10000)
	private String content;
	
	// 리뷰 일시
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date date;
	
	// 작성자 이름
	@OneToMany(mappedBy = "reivew", fetch = FetchType.EAGER)
	private List<User> user = new ArrayList<User>();

}
