package com.SpringApplication.StudentManagementSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.SpringApplication.StudentManagementSystem.Model.Student;
import com.SpringApplication.StudentManagementSystem.Service.StudentService;

@Controller
public class StudentManagementSystemController {
 
	private StudentService studentService;
	
	public StudentManagementSystemController(StudentService studentService)
	{
	            this.studentService = studentService;
	 }
	
	@GetMapping("/students")
	public String listStudents(Model model) {
	model.addAttribute("students",studentService.getAllStudents());
	return "students";
	}  
	
	@GetMapping("/students/add")
	public String createStudentForm(Model model) {
	Student student=new  Student();
	model.addAttribute("student", student);
	return "add";
	} 
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
	studentService.saveStudent(student);
	return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
	model.addAttribute("student", studentService.getStudentById(id));
	return "edit";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
	Student existingStudent = studentService.getStudentById(id);
	existingStudent.setId(id);
	existingStudent.setFirstName(student.getFirstName());
	existingStudent.setLastName(student.getLastName());
	existingStudent.setProgramName(student.getProgramName());
	existingStudent.setEmail(student.getEmail());
	// save updated student object
	studentService.updateStudent(existingStudent);
	return "redirect:/students";
	}
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
		}
}
