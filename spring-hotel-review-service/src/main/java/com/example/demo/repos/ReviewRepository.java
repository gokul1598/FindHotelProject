package com.example.demo.repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Review;
@Repository
public interface ReviewRepository extends MongoRepository<Review, Integer> {

	List<Review> findByHotelName(String hotelName);

	

}
