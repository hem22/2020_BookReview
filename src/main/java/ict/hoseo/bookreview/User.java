package ict.hoseo.bookreview;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(uniqueConstraints = {
		@UniqueConstraint(name = "uc_user", columnNames = {"phone", "email"})
})
public class User {
	@Id
	@Column(length = 30, name="user_id")
	private String id;
	
	@Column(length = 40, nullable = false)
	private String password;
	
	@Column(length = 30, nullable = false)
	private String name; 		// 김혜미
	
	@Column(length = 13)
	private Integer phone;
	
	@Column(length = 50)
	private String email;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="review_id")
	private Review review;
	
	
	
}
