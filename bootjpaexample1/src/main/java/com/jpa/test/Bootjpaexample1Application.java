package com.jpa.test;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;


@SpringBootApplication
public class Bootjpaexample1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Bootjpaexample1Application.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("Pallavi Deore");
		user.setCity("Pune");
		user.setStstus("Learning Java");
		
		User user1=userRepository.save(user);
		System.out.println(user1);

			//Create object for user
//		User user1 = new User();
//		user1.setName("Deore");
//		user1.setCity("Nashik");
//		user1.setStstus("Learning JS");
//		
//		User user2 = new User();
//		user2.setName("Radhika");
//		user2.setCity("Malegaon");
//		user2.setStstus("React");
//		
//		Saving single user
		
//		User resultUser=userRepository.save(user2);
		
//		System.out.println("Save user "+resultUser);
//		System.out.println("Done");
		
		
			
//		here we save all the users using list
		
//		
//		  List<User> users=List.of(user1,user2);
	
		
//		save multiple object
//		    Iterable<User> result= userRepository.saveAll(users);
		    
		    
		   // by using this we print result
//		    result.forEach(user->{
//		    	System.out.println(user);
//		    	
//		    	
//		    });
//		   
			
//			//System.out.println("saved user " +resultUser);
//			System.out.println("Done");
//			
		
		//  Update the user of ID 6
		
//		Optional<User> optional=userRepository.findById(8);
//		
//		User user = optional.get();
//		
//		user.setName("Pallavi Deore");
//		User result=userRepository.save(user);
//		System.out.println(result);		
		
//		how to get the data
		//findById(id) - return optional containing your data
//		  
//             Iterable<User>	itr=userRepository.findAll();
//             Iterator<User> iterator=itr.iterator();
//             
//             while(iterator.hasNext());
//             {
//            	 User user = iterator.next();
//            	 System.out.println(user);
//            	 
//            	 
//             }
             
             
//             itr.forEach(new Consumer<User>() {
//
//				@Override
//				public void accept(User t) {
//					// TODO Auto-generated method stub
//					System.out.println(t);
//					
//				}
//            	 });
		
		//DEleting the user element
//             
//             userRepository.deleteById(9);
//             System.out.println("Deleting User");
//             
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			}

}
