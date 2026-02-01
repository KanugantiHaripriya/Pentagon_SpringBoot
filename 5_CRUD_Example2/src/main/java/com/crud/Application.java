package com.crud;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.crud.Entity.Book;
import com.crud.repo.BookRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
		BookRepo repo = ctxt.getBean(BookRepo.class);
	
		Book b1 = new Book(1,"Java","James Gosling",500);
		Book b2 = new Book(2,"Spring","Rod Jhonson",700);
		Book b3 = new Book(3,"C","Dennis Ritchie",400);
		Book b4 = new Book(4,"C++","Bjarne Stroustrup",450);
		Book b5 = new Book(5,"Python","Guido van Rossum",500);
		Book b6 = new Book(6,"Swift","Apple",300);
		
//		repo.saveAll(Arrays.asList(b1,b2,b3,b4,b5,b6));
//		
//		List<Book> b = repo.findByPriceGreaterThan(400);
//		for(Book bk:b) {
//			System.out.println(bk);
//		}
	
	//	b.forEach(System.out::println);
		
		
//		List<Book> b = repo.findByPriceLessThan(400);
//		b.forEach(System.out::println);
		
		
//		List<Book> b = repo.findByName("Python");
//		b.forEach(System.out::println);
		
//		List<Book>  b =repo.findByAuthorName("Guido Van Rossum");
//		b.forEach(System.out::println);
		
//		b=repo.findByAuthorNameAndPriceLessThanEqual("Dennis Ritchie",500);
//		b.forEach(System.out::println);
		
//		b=repo.findByNameAndPriceGreaterThanEqual("Swift",500);
//		b.forEach(System.out::println);
		
	}
} 
