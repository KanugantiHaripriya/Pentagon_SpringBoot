package data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import data.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer>{

	
}
