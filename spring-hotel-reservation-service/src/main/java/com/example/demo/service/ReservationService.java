package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Reservation;
import com.example.demo.repos.ReservationRepository;
@Service(value="ReservationService")
public class ReservationService {
      @Autowired
	  ReservationRepository repo;
	public Reservation save(Reservation slot) {
		
		return this.repo.save(slot);
	}
	public List<Reservation> findAll() {
		return this.repo.findAll();
	}
	public List<Reservation> findByUserID(int userId) {
		
		return this.repo.findByUserId(userId);
	}

}
