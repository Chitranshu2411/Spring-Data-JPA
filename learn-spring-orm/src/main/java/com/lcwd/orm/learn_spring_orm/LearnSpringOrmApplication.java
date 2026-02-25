package com.lcwd.orm.learn_spring_orm;

import com.lcwd.orm.learn_spring_orm.entities.User;
import com.lcwd.orm.learn_spring_orm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setName("Chitranshu");
		user.setCity("Bhopal");
		user.setAge(22);
		User savedUser = userService.saveUser(user);
	}
}