package com.tasks.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tasks.entities.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {

}
