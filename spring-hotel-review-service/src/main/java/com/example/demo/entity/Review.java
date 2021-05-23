package com.example.demo.entity;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Review {
	@Id
	private int id;
    private String hotelName; 
    private String reviewedBy; 
    private String reviewAspect; 
    private String reviewBody; 
    private Double reviewRating; 
}
