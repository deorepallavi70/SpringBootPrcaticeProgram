package com.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetomany.model.Post;

public interface PostRepository extends JpaRepository<Post,Long> {

}
