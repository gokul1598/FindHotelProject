package com.example.demo.repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.InfoHotel;
@Repository
public interface InfoHotelRepository extends MongoRepository<InfoHotel, Integer> {

	
//findByname,menutype,servicearea,ser

	List<InfoHotel> findByMenuType(String menu);

	List<InfoHotel> findByServiceArea(String serviceArea);

	List<InfoHotel> findByName(String name);
	
	
	}

