package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Reservation;
import com.example.demo.service.ReservationService;

@RestController
@RequestMapping(path = "/api/v1")
public class ReservationController {
 
	
	    private ReservationService service;

		public ReservationController(ReservationService service) {
			super();
			this.service = service;
		}
		@PostMapping("/slot")
		public Reservation addSlot(@RequestBody Reservation slot) {
			return this.service.save(slot);
		}  
		  
		@GetMapping(path="/slot")
		public List<Reservation> findAll(){
			return this.service.findAll();
	} 
		
		@GetMapping(path = "/slot/{userId}")
		public List<Reservation> getByUserId(@PathVariable("userId") int userId) {
			return this.service.findByUserID(userId);
	}
}

