package com.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manytomany.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
