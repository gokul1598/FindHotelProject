package com.example.demo.repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Reservation;
@Repository
public interface ReservationRepository extends MongoRepository<Reservation, Integer> {

	List<Reservation> findByUserId(int userId);

}
