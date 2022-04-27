package com.SpringApplication.StudentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringApplication.StudentManagementSystem.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{ 
	
}