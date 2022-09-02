package com.jpa.test.BookApplication.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jpa.test.BookApplication.entities.Book;


public interface BookRepo extends JpaRepository<Book,Integer > {

}
