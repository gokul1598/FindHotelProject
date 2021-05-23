package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.demo.entity.Review;
import com.example.demo.repos.ReviewRepository;

@EnableEurekaClient
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = ReviewRepository.class)
public class SpringHotelReviewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelReviewServiceApplication.class, args);
	}
//	@Bean
//	public CommandLineRunner runner() {
//		
//		return new CommandLineRunner() {
//		
//			@Autowired
//			ReviewRepository repo;
//		
//			@Override
//			public void run(String... args) throws Exception {
//			Review review =new Review(101,"SaravanaBhavan","Gokul","Good","Great place to spend time with family",4.5);
//			repo.save(review);
//			}
//		};
//}
}