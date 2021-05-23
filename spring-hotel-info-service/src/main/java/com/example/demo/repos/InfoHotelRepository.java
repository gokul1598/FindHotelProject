package com.example.demo.repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.InfoHotel;

@Repository
public interface InfoHotelRepository extends MongoRepository<InfoHotel, Integer> {

	
//findByname,menutype,servicearea,ser

	List<InfoHotel> findByMenuType(String menu);

	List<InfoHotel> findByServiceArea(String serviceArea);

	List<InfoHotel> findByName(String name);

    List<InfoHotel> deleteByName(String name);
//    @Query(value = "{name : ?0}", delete = true)
//	List<InfoHotel> deleteByName(String name);

	List<InfoHotel> save(String name);

	List<InfoHotel> findByServiceAreaAndName(String serviceArea, String name);

	List<InfoHotel> findByServiceAreaAndMenuType(String serviceArea, String menu1);

	


	
	}

