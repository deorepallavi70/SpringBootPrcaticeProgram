package com.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manytomany.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {

}
