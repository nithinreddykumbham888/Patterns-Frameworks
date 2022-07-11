package com.SpringApplication.SpringBootDemo.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringApplication.SpringBootDemo.Entity.Airline;
import com.SpringApplication.SpringBootDemo.Repository.AirlineRepository;


@Service
public class AirlineServiceImpl implements AirlineService {
	
	@Autowired
	private AirlineRepository airlineRepository;

	@Override
	public Airline saveAirline(Airline airline) {
		// TODO Auto-generated method stub
		return airlineRepository.save(airline);
	}

	@Override
	public List<Airline> getAllAirlines() {
		// TODO Auto-generated method stub
		return airlineRepository.findAll();
	}

	@Override
	public Airline getAirlineById(Long airlineID) {
		// TODO Auto-generated method stub
		return airlineRepository.findById(airlineID).get();
	}

	@Override
	public Airline getAirlineByName(String airlineName) {
		// TODO Auto-generated method stub
		return airlineRepository.findByAirlineNameIgnoreCase(airlineName);
	}

	@Override
	public Airline updateAirlineData(Airline airline, Long airlineID) {
		// TODO Auto-generated method stub
         Airline airDB = airlineRepository.findById(airlineID).get();
		
		if(Objects.nonNull(airline.getAirlineName()) && !"".equalsIgnoreCase(airline.getAirlineName())) {
			airDB.setAirlineName(airline.getAirlineName());
		}
		
		if(Objects.nonNull(airline.getAirlineEstablishYear())) {
			airDB.setAirlineEstablishYear(airline.getAirlineEstablishYear());
		}
		
		if(Objects.nonNull(airline.getAirlineValuation())) {
			airDB.setAirlineValuation(airline.getAirlineValuation());
		}
		
		if(Objects.nonNull(airline.getAirlineOriginCountry()) && !"".equalsIgnoreCase(airline.getAirlineOriginCountry())) {
			airDB.setAirlineOriginCountry(airline.getAirlineOriginCountry());
		}
		
		if(Objects.nonNull(airline.isAirlineOperatesInternationally())) {
			airDB.setAirlineOperatesInternationally(airline.isAirlineOperatesInternationally());
		}
		
		return airlineRepository.save(airDB);
	}

	@Override
	public void deleteAirline(Long airlineID) {
		// TODO Auto-generated method stub
		airlineRepository.deleteById(airlineID);
	}

}
