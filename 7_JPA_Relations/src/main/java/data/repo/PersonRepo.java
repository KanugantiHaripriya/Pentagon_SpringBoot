package data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import data.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
 