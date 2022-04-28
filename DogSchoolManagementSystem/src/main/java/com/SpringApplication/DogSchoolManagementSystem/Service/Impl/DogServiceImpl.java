package com.SpringApplication.DogSchoolManagementSystem.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringApplication.DogSchoolManagementSystem.Model.Dog;
import com.SpringApplication.DogSchoolManagementSystem.Repository.DogRepository;
import com.SpringApplication.DogSchoolManagementSystem.Service.DogService;


@Service
public class DogServiceImpl implements DogService{
	
	private DogRepository dogRepository;

	public DogServiceImpl(DogRepository dogRepository) {
		this.dogRepository = dogRepository;
		}

	@Override
	public List<Dog> getAllDogs() {
		// TODO Auto-generated method stub
		return dogRepository.findAll();
	}

	@Override
	public Dog saveDog(Dog dog) {
		// TODO Auto-generated method stub
		return dogRepository.save(dog);
	}

	@Override
	public Dog getDogById(Long id) {
		// TODO Auto-generated method stub
		return dogRepository.findById(id).get();
	}

	@Override
	public Dog updateDog(Dog dog) {
		// TODO Auto-generated method stub
		return dogRepository.save(dog);
	}

	@Override
	public void deleteDogById(Long id) {
		// TODO Auto-generated method stub
		dogRepository.deleteById(id);
	}

}
