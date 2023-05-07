package com.microservice.userapi;

import com.microservice.userapi.domain.Usuario;
import com.microservice.userapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {



	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(
				 new Usuario(null, "Tiago", "tiago@gmail.com", "123", 20.0),
				 new Usuario(null, "Monique", "monique@gmail.com", "123", 50.0),
				 new Usuario(null, "Lucas", "lucas@gmail.com", "123", 70.0)));
	}
}
