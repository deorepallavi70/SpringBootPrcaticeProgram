package com.jpa.test.BookApplication.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jpa.test.BookApplication.entities.Book;
@Component

public class BookService {
       
	private static List<Book>  list=new ArrayList<>();
	
	static {
		
		list.add(new Book(12,"java","xyz"));
		list.add(new Book(13,"js","abs"));
		list.add(new Book(14,"python","kfc"));
	}
	
	
	//get all books
	public List<Book>  getAllBooks()
	{
	
		return list;
	}
	
	//get single book by id
	public Book getBookById(int id)
	{
		Book book=null;
		book=list.stream().filter(e->e.getId()==id).findFirst().get();
		
		return book;
		
	}
}
