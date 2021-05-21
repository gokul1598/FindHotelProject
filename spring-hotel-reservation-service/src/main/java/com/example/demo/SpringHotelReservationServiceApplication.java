package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.entity.Reservation;
import com.example.demo.repos.ReservationRepository;

@EnableEurekaClient
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = ReservationRepository.class)
public class SpringHotelReservationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelReservationServiceApplication.class, args);
	}
//	@Bean
//	public CommandLineRunner runner() {
//		
//		return new CommandLineRunner() {
//		
//			@Autowired
//			ReservationRepository repo;
//		
//			@Override
//			public void run(String... args) throws Exception {
//			Reservation reserve =new Reservation(198,LocalDateTime.now(),1598,500);
//			repo.save(reserve);
//			}
//		};
		@Bean
		@LoadBalanced
		public WebClient.Builder bulider(){
			return WebClient.builder();
		}
		@Bean
		public WebClient client(WebClient.Builder builderRef) {
			return builderRef.build();
					
		}
	
	
	}

