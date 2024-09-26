package com.bridgelabz.springbootproject;

import com.bridgelabz.springbootproject.Dao.UserRepository;
import com.bridgelabz.springbootproject.Entity.User;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringbootprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootprojectApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

//		//Create------------------>
//
//		User user = new User();
//		user.setName("Pratik Pedhavi");
//		user.setCity("Alibag");
//		user.setStatus("I am OR Scientist");
//
//		User user1 = userRepository.save(user);
//
//		System.out.println(user1);
//
//		User user2 = new User();
//		user2.setName("Vishangi");
//		user2.setCity("Panvel");
//		user2.setStatus("I am fullstack developer");
//
//		User user3 = new User();
//		user3.setName("Prachiti");
//		user3.setCity("Panvel");
//		user3.setStatus("I am python developer");
//
//		//saving single user
//		User result = userRepository.save(user1);
//
		//saving multiple users------------------->
//		List<User> users = List.of(user2,user3);
//		Iterable<User> result = userRepository.saveAll(users);
//
//		result.forEach(e->{
//			System.out.println("Saved user"+e);
//
//		});
//
//		System.out.println("Done");

		//Update--------------------->

//		Optional<User> optional = userRepository.findById(3);
//		User user = optional.get();
//		user.setName("Siddhi");
//		user.setStatus("I am backend developer");
//		user.setCity("Vashi");
//		User result = userRepository.save(user);
//		System.out.println(result);

//		//get------------------------->
//		Optional<User> optional1 = userRepository.findById(1);
//		User result2 = optional1.get();
//		System.out.println(result2);

//		//get All data---------------->
//		Iterable<User> iterable = userRepository.findAll();
//		iterable.forEach(user1 -> {
//			System.out.println(user1);
//		});

		//Delete by Id----------------->
//		userRepository.deleteById(152);
//		System.out.println("Deleted");


		//Delete by Iterable method----------->
//		Iterable<User> iterable = userRepository.findAll();
//		iterable.forEach(user2 -> {
//			System.out.println(user2);
//		});l
//		userRepository.deleteAll(iterable);

//		//find by name------------------>
//		List<User> list = userRepository.findByName("Pratik");
//		list.forEach(a -> {System.out.println(a);});



//		//find by name and city----------->
//		List<User> list = userRepository.findByNameAndCity("Vishangi","Panvel");
//		list.forEach(user -> {
//			System.out.println(user);
//		});

//		//find by name or city---------------->
//		List<User> list = userRepository.findByNameOrCity("Vishangi","Panvel");
//		list.forEach(user -> {
//			System.out.println(user);
//		});
//
//		// get all user by query-------------->
//		List<User> list = userRepository.getAllUsers();
//		list.forEach(user -> {
//			System.out.println(user);
//		});
//
//		//get user by name using query---------->
//		List<User> list = userRepository.getByUserName("Vishangi");
//		list.forEach(user ->{
//			System.out.println(user);
//		});

		//get user by name and city using query---------->
		List<User> list = userRepository.getByUserNameAndCity("Vishangi","Panvel");
		list.forEach(user ->{
			System.out.println(user);
		});


	}

}
