package com.example.jpa;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.jpa.entity.Gender;
import com.example.jpa.entity.User;
import com.example.jpa.entity.UserProfile;
import com.example.jpa.repository.UserProfileRepository;
import com.example.jpa.repository.UserRepository;

@SpringBootApplication
public class OneToOneMappingApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	 
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@Override
	public void run(String... args) throws Exception 
	{
		//user object
		
		User user=new User();
		user.setName("Parul");
		user.setEmail("abs@gmail.com");
	
		
		
		
		
		UserProfile userProfile=new UserProfile();
		userProfile.setAddress("I.U.D.P");
		userProfile.setBirthOfDate(	LocalDate.of(1998,12 , 12 ));
		userProfile.setGender(Gender.FEMALE);
		userProfile.setPhnno("1234567898");
		
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		userRepository.save(user);
	}
//
//	public UserProfileRepository getUserProfileRepository() {
//		return userProfileRepository;
//	}
//
//	public void setUserProfileRepository(UserProfileRepository userProfileRepository) {
//		this.userProfileRepository = userProfileRepository;
//	}

}
