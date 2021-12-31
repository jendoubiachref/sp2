package com.abir.users;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.abir.users.entities.User;
import com.abir.users.repos.UserRepository;
//import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
@SpringBootTest
class UsersApplicationTests {

	@Autowired
	UserRepository userRep;
	
	@Test
	void contextLoads() {
	}

	@Test
	void testusername() {
		
		User u = userRep.findByUsername("user");
		System.out.print(u);
		
	}
	
}
