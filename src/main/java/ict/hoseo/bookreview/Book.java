package ict.hoseo.bookreview;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(uniqueConstraints = {
		@UniqueConstraint(columnNames= {"isbn"})
})
public class Book {
	@Id
	@GeneratedValue(generator = "seq_book", strategy = GenerationType.AUTO)
	@Column(name="book_id")
	private Integer id;
	
	// 13코드
	@Column(length = 13, nullable = false)
	private String isbn ; 
	
	@Column(nullable = false, name="book_t")
	private String title;
	
	@OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
	private List<BookAuthor> authors = new ArrayList<BookAuthor>();

	private double price;	
	
	@OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
	private List<Review> reviews = new ArrayList<Review>();

}
