package com.SpringApplication.DogSchoolManagementSystem.Service;

import java.util.List;

import com.SpringApplication.DogSchoolManagementSystem.Model.Dog;



public interface DogService {

	public List<Dog> getAllDogs();  
	public Dog saveDog(Dog dog);
	public Dog getDogById(Long id);
	public Dog updateDog(Dog dog);
	public void deleteDogById(Long id);
}
