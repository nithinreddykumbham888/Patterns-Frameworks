package com.SpringApplication.SpringBootDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringApplication.SpringBootDemo.Entity.Airline;
import com.SpringApplication.SpringBootDemo.Service.AirlineService;

@RestController
public class AirlineController {
	
	@Autowired
	private AirlineService airlineService;
	
	@GetMapping("/welcome")
	public String welcomeMessage() {
		return "Hello, Welcome to Airline Page";
	}
	
	@PostMapping("/airline")
	public Airline saveAirline(@RequestBody Airline airline) {
		return airlineService.saveAirline(airline);
	}
	
	@GetMapping("/airlines")
	public List<Airline> getAllAirlines(){
		return airlineService.getAllAirlines();
	}
	
	@GetMapping("/airline/{id}")
	public Airline getAirlineById(@PathVariable("id") Long airlineID) {
		return airlineService.getAirlineById(airlineID);
	}
	
	@GetMapping("/airline/name/{name}")
	public Airline getAirlineByName(@PathVariable("name") String airlineName) {
		return airlineService.getAirlineByName(airlineName);
	}
	
	@PutMapping("/airline/{id}")
	public Airline updateAirlineData(@RequestBody Airline airline,@PathVariable("id") Long airlineID) {
		return airlineService.updateAirlineData(airline,airlineID);
	}
	
	@DeleteMapping("/airline/{id}")
	public String deleteAirline(@PathVariable("id") Long airlineID) {
		airlineService.deleteAirline(airlineID);
		return "Airline Deleted Succesfully!!";
	}

}
