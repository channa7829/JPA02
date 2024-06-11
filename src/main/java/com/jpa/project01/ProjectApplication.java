package com.jpa.project01;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.project01.entity.User;
import com.jpa.project01.repo.UserRepo;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProjectApplication.class, args);
		
		UserRepo uSerRepobean = context.getBean("userRepo", UserRepo.class);
		
//		User user1 = new User(204,"mran","Bangalore",27);
//		User user2 = new User(205,"lran","mangalore",32);
//		User user3 = new User(206,"oran","mangalore",31);
		
		//saving mupliple objs
		// uSerRepobean.saveAll(Arrays.asList(user1,user2,user3));
		// System.out.println(" all records are saved");
		 
		 //find by id (PK)
		 
//		 Optional<User> userbyId = uSerRepobean.findById(801);
//		 if (userbyId.isPresent()) {
//			  User user = userbyId.get();
//			  System.out.println(" ====="+user);
//		}
//		 else {
//			System.out.println(" record not exits");
//		 }
//	 
		   long count = uSerRepobean.count();
		   System.out.println(" count :"+count);
		 
		   List<User> byUserLocattaion = uSerRepobean.findByUserLocattaion("Bangalore");
		   byUserLocattaion.forEach(user->{
			   System.out.println(" "+user);
		   });
		    System.out.println("-------------01------------------------------------------");
		   List<User> byUserage = uSerRepobean.findByUserage(27);
		   byUserage.forEach(user->{
			   System.out.println(" "+user);
		   });
		   System.out.println("---------------02----------------------------------------");
		    uSerRepobean.findByUserage (30);
		   byUserage.forEach(user->{
			   System.out.println(" "+user);
		   });
		   
	}

}
