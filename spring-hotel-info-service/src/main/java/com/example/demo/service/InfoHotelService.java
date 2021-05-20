package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.InfoHotel;
import com.example.demo.repos.InfoHotelRepository;
@Service(value="InfoHotelService")
public class InfoHotelService {
	   @Autowired
       private InfoHotelRepository repo;
	
	public InfoHotel save(InfoHotel hotel) {
		return this.repo.save(hotel);
	}

	public List<InfoHotel> findAll() {
		return this .repo.findAll();
	}
	public  List<InfoHotel> findByName(String name) {
		return this.repo.findByName(name);
}
	 public List<InfoHotel> findByMenuType(String menu){
		 return this.repo.findByMenuType(menu);
	 }
	 
	 public List<InfoHotel> findByServiceArea(String serviceArea){
		 return this.repo.findByServiceArea(serviceArea);
	 }
} 