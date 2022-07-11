package com.SpringApplication.SpringBootDemo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.SpringApplication.SpringBootDemo.entity.Department;
import com.SpringApplication.SpringBootDemo.repository.DepartmentRepository;

@SpringBootTest
class DepartmentServiceTest {

	@Autowired
	private DepartmentService departmentService;
	
	@MockBean
	private DepartmentRepository departmentRepository;
	
	@BeforeEach
	void setUp() throws Exception {
		Department department = Department.builder()
				                .departmentId(1L)	
				                .departmentName("MECH")
				                .departmentAddress("Nagpur")
				                .departmentCode("MECH-05")
				                .build();
		
		Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("MECH")).thenReturn(department);
	}

	@Test
	@DisplayName("Return Department Test Case")
	public void whenDepartNameFound_ShouldReturnTestCasePassed() {
		String departmentName = "MECH";
		Department found = departmentService.fetchDepartmentByName(departmentName);
		
		assertEquals(departmentName, found.getDepartmentName()); 
	}
	
}
