package com.CrudOperation.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CrudOperation.example.ent.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

Product findByName(String name);

}
