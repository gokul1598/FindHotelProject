package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Review;
import com.example.demo.repos.ReviewRepository;
@Service(value="ReviewService")
public class ReviewService {
        @Autowired
	   ReviewRepository repo;
	          
	public Review save(Review review) {
		return this.repo.save(review);
	}

	public List<Review> findAll() {
		return this.repo.findAll();
	}

	public List<Review> findByHotelName(String hotelName) {
		return this.repo.findByHotelName(hotelName);
	}

}
