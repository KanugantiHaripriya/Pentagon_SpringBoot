package data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passport {
	
	



	@Id
	private Integer id;
	private String passNumber;
	
	@OneToOne  // one person has one passport
	@JoinColumn(name="passId") // foreign key in person table
	private Passport passport; // has a relation

}
