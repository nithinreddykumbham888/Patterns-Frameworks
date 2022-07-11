package com.SpringApplication.SpringBootDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringApplication.SpringBootDemo.Entity.Airline;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long> {
	
	public Airline findByAirlineNameIgnoreCase(String airlineName);

}
