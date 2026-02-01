package com.crud.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.crud.Entity.Book;

public interface BookRepo extends CrudRepository<Book,Integer>{
	
	public List<Book> findByPriceGreaterThan(Integer p);
	
	public List<Book> findByPriceLessThan(Integer p);
	
	public List<Book> findByName(String name);
	
	public List<Book> findByAuthorName(String name);
	
	public List<Book> findByAuthorNameAndPriceLessThanEqual(String name, Integer p);
	
	public List<Book> findByNameAndPriceGreaterThanEqual(String name,Integer p);
	
	//jpl queries
	@Query("from Book")
//	@Query(value="SELECT * FROM Book ", nativeQuery =true)
	public List<Book> getAllBooks();
	
	
}
