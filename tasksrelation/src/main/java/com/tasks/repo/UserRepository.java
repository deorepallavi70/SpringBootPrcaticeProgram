package com.tasks.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tasks.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
