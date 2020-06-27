package ict.hoseo.bookreview;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Builder
@AllArgsConstructor
public class BookAuthor {
	
	@Id
	@GeneratedValue(generator = "seq_bookauth")
	@Column(name="bookauthor_id")
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="author_id")
	private Author author;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="book_id")
	private Book book;
}
