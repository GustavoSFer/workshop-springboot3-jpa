package com.fernandes.courseSpring.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.fernandes.courseSpring.entities.User;
import com.fernandes.courseSpring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired // com esse data notation ele resolve a dependencia e associnar uma instancia de UserRepository aqui dentro;
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User("Pedro Silva", "Silva@gmail.com", "11259554521", "159874");
		User u2 = new User("Amanda", "amandinha@gmail.com", "1128885521", "1500074");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
