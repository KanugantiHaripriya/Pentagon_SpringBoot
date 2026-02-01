package data.Runner;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import data.entity.Passport;
import data.entity.Person;
import data.repo.PassportRepo;
import data.repo.PersonRepo;


@Component
public class OneToOneRunner implements CommandLineRunner{

	@Autowired
	private PersonRepo prRepo;
	
	@Autowired
	private PassportRepo psRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Passport pass1 = new Passport(1,"IND123456");
//		Passport pass2 = new Passport(2,"IND876598");
		
		psRepo.save(pass1); //saving passport object
		
		Person p1 = new Person(1, "Shakti", pass1);
		// Person
		prRepo.save(p1); //saving person object
		
		List<Person> p = prRepo.findAll();
		p.forEach(System.out::println);
	}

}
