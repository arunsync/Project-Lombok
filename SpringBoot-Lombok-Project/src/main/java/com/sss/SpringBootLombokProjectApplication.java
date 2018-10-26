package com.sss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sss.model.User1;
import com.sss.model.User2;

@SpringBootApplication
public class SpringBootLombokProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLombokProjectApplication.class, args);
		
		System.out.println(new User1());
		System.out.println(new User2());
	}
}
