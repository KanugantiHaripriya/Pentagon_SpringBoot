package data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	@Id
	private Integer id;
	private String name;
	
	@OneToOne
	private Passport passport; // has a relation
}
