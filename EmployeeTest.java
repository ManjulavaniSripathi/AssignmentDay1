package com.capgemini.day3testcases;

	import static org.junit.jupiter.api.Assertions.assertEquals;

	import org.junit.jupiter.api.AfterEach;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;

import com.day3.Employee;


	public class EmployeeTest {
		
		Employee employee;
		
		@BeforeEach
		void setUp() {
			employee = new Employee(1234, "John Doe", 13000, 2500);
		}
		
		@Test
		void testCalculateNetSalary() {
			assertEquals(20240.0, employee.calculateNetSalary(), 0.03);
		}
		
		@AfterEach
		void tearDown() {
			employee = null;
		}
	}


