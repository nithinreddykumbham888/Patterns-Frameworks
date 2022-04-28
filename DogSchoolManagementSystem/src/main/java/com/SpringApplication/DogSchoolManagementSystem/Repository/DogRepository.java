package com.SpringApplication.DogSchoolManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringApplication.DogSchoolManagementSystem.Model.Dog;



public interface DogRepository extends JpaRepository<Dog, Long>{

}

