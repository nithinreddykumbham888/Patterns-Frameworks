package com.SpringApplication.SpringBootDemo.Service;

import java.util.List;

import com.SpringApplication.SpringBootDemo.Entity.Airline;

public interface AirlineService {

	Airline saveAirline(Airline airline);

	List<Airline> getAllAirlines();

	Airline getAirlineById(Long airlineID);

	Airline getAirlineByName(String airlineName);

	Airline updateAirlineData(Airline airline, Long airlineID);

	void deleteAirline(Long airlineID);

}
