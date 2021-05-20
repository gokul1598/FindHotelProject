package com.example.demo.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InfoHotel {
	@Id
	 private int id; 
     private String name; 
	 private String serviceArea; 
     private String emailAddress; 
     private MenuType menuType; 
     private String openingHours; 
}
