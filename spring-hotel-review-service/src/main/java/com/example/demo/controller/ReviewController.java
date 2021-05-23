package com.example.demo.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Review;
import com.example.demo.service.ReviewService;
@RestController
@RequestMapping(path = "/api/v1")
public class ReviewController {
	
	 private ReviewService service;

	public ReviewController(ReviewService service) {
		super();
		this.service = service;
	}
	@PostMapping("/review")
	public Review addReview(@RequestBody Review review) {
		return this.service.save(review);
	}  
	  
	@GetMapping(path="/review")
	public List<Review> findAll(){
		return this.service.findAll();
} 
	@GetMapping(path ="/review/{hotelName}")
	public List<Review> getByHotelName(@PathVariable("hotelName") String hotelName) {
		return this.service.findByHotelName(hotelName);
}
}
