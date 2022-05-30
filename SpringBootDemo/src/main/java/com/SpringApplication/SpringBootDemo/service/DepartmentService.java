package com.SpringApplication.SpringBootDemo.service;

import java.util.List;

import com.SpringApplication.SpringBootDemo.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId);

	public static void deleteDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		
	}

}
