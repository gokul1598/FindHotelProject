package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.demo.entity.InfoHotel;
import com.example.demo.entity.MenuType;
import com.example.demo.repos.InfoHotelRepository;


@EnableEurekaClient
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = InfoHotelRepository.class)
public class SpringHotelInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelInfoServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
		
			@Autowired
			InfoHotelRepository repo;
		
			@Override
			public void run(String... args) throws Exception {
			MenuType menu= new MenuType("South_Indian","North-Indian","continental","Chinese");
			InfoHotel hotel=new InfoHotel(101,"SaravanaBhavan","100feet road","sb@gmail.com", menu,"Alldays");
			repo.save(hotel);
			}
		};
	}
}
