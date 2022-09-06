package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.entity.UserProfile;

public interface UserProfileRepository  extends JpaRepository<UserProfile, Long>{

}
