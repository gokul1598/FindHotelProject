package com.example.demo.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.InfoHotel;
import com.example.demo.service.InfoHotelService;



@RestController
@RequestMapping(path = "/api/v1")
public class InfoController {
	
	  private InfoHotelService service;
//constructor dependency injection:
	public InfoController(InfoHotelService service) {
		super();
		this.service = service;
	}
	  
	@PostMapping("/hotels")
	public InfoHotel addBook(@RequestBody InfoHotel hotel) {
		return this.service.save(hotel);
	}  
	  
	@GetMapping(path="/hotels")
	public List<InfoHotel> findAll(){
		return this.service.findAll();
}
	
	@GetMapping(path = "/hotels/srch/name/{name}")
	public List<InfoHotel> getByName(@PathVariable("name") String name) {
		return this.service.findByName(name);
}
	@GetMapping(path = "/hotels/srch/servicearea/{serviceArea}")
	public List<InfoHotel> getByServiceArea(@PathVariable("serviceArea") String serviceArea) {
		return this.service.findByServiceArea(serviceArea);
	}
	@GetMapping(path = "/hotels/srch/menutype/{menuType}")
	public List<InfoHotel> getByMenuType(@PathVariable("menuType") String menuType) {
		return this.service.findByMenuType(menuType);
}
}