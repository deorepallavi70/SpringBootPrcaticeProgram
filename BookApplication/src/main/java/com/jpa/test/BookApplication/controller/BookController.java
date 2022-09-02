package com.jpa.test.BookApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.BookApplication.entities.Book;
import com.jpa.test.BookApplication.services.BookService;

@RestController
public class BookController {


//	public Book getBooks()
//	{
//	Book book=new Book();
//	book.setId(1234);
//	book.setTittle("java");
//	book.setAuthor("xyz");
//		return book; 
//	}
      	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/books")
	public List<Book> getBooks(){
	return this.bookService.getAllBooks();
	
	}  
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id)
	{
		   return bookService.getBookById(id);
		
		
	}
	
}
