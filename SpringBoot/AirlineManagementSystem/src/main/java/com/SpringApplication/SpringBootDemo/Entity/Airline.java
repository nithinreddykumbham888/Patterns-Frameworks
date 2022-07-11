package com.SpringApplication.SpringBootDemo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Airline {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long airlineID;
	
	private String airlineName;
	private int airlineEstablishYear;
	private double airlineValuation;
	private String airlineOriginCountry;
	private boolean airlineOperatesInternationally;

}
