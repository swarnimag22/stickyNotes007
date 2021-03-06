package com.stickynotes.sticky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@ComponentScan("com.stickynotes.*")
@EntityScan("com.stickynotes.*")
@EnableJpaRepositories("com.stickynotes.*")
public class StickyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StickyApplication.class, args);
	}
}
