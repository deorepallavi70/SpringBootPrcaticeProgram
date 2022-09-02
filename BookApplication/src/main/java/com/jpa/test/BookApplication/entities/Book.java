package com.jpa.test.BookApplication.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	private int id;
	private String tittle;
	private String author;
	
	
	public Book(int id, String tittle, String author) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.author = author;
	}


	public Book() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTittle() {
		return tittle;
	}


	public void setTittle(String tittle) {
		this.tittle = tittle;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", tittle=" + tittle + ", author=" + author + "]";
	}
	
	
	
	
}
