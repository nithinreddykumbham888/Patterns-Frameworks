package com.SpringApplication.DogSchoolManagementSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.SpringApplication.DogSchoolManagementSystem.Model.Dog;
import com.SpringApplication.DogSchoolManagementSystem.Service.DogService;


@Controller
public class DogSchoolManagementSystemController {

private DogService dogService;
	
	public DogSchoolManagementSystemController(DogService dogService)
	{
	            this.dogService = dogService;
	 }
	
	@GetMapping("/dogs")
	public String listDogs(Model model) {
	model.addAttribute("dogs",dogService.getAllDogs());
	return "dogs";
	}  
	
	@GetMapping("/dogs/add")
	public String createDogForm(Model model) {
	Dog dog=new  Dog();
	model.addAttribute("dog", dog);
	return "add";
	} 
	
	@PostMapping("/dogs")
	public String saveDog(@ModelAttribute("dog") Dog dog) {
	dogService.saveDog(dog);
	return "redirect:/dogs";
	}
	
	@GetMapping("/dogs/edit/{id}")
	public String editDogForm(@PathVariable Long id, Model model) {
	model.addAttribute("dog", dogService.getDogById(id));
	return "edit";
	}
	
	@PostMapping("/dogs/{id}")
	public String updateDog(@PathVariable Long id, @ModelAttribute("dog") Dog dog, Model model) {
	Dog existingDog = dogService.getDogById(id);
	existingDog.setId(id);
	existingDog.setName(dog.getName());
	existingDog.setBreed(dog.getBreed());
	// save updated student object
	dogService.updateDog(existingDog);
	return "redirect:/dogs";
	}
	
	@GetMapping("/dogs/{id}")
	public String deleteDog(@PathVariable Long id) {
		dogService.deleteDogById(id);
		return "redirect:/dogs";
		}
}
