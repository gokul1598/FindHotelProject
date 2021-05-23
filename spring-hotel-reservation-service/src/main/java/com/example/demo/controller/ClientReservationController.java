package com.example.demo.controller;

//import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.schema.JsonSchemaObject.Type.JsonType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;



import reactor.core.publisher.Flux;
@RestController
public class ClientReservationController {
	 @Autowired
		private WebClient client;

	public ClientReservationController(WebClient client) {
		super();
		this.client = client;
	}
	@GetMapping(path="/api/v1/hotels")
	public  Flux<String> getInfoHotel(){
		return client.get().uri("http://HOTEL-INFO/api/v1/hotels").retrieve().bodyToFlux(String.class);
}
	@GetMapping(path="/api/v1/review")
	public  Flux<String> getReview(){
		return client.get().uri("http://HOTEL-REVIEW/api/v1/review").retrieve().bodyToFlux(String.class);
}
}