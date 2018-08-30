package com.capgemini.day6Testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;
import com.capgemini.day6.CellPhone;
import com.capgemini.day6.Laptop;
import com.capgemini.day6.School;
import com.capgemini.day6.Television;

class CollectionTest {
	
	@Test
	void testLaptop() {
		ArrayList<Laptop>laptop = new ArrayList<Laptop>();
		assertEquals(true, laptop.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5")));
		assertEquals(true,laptop.add(new Laptop("HP", "HP234", "Windows 10", "i3")));
		assertEquals(true,laptop.add(new Laptop("Lenovo", "HP677", "Windows 7", "i7")));
		assertEquals(3,laptop.size());
	}
	
	@Test
	void testCar() {
		ArrayList<Car>car= new ArrayList<Car>();
		assertEquals(true, car.add(new Car("Bmw", "Bm34", 2013, 1000000)));
		assertEquals(true, car.add(new Car("Innova", "Inn890", 2012, 2000000)));
		assertEquals(true, car.add(new Car("Alto", "Alt567", 2000, 3000000)));
		assertEquals(3,car.size());

	}

	@Test
	void testCellphone() {
		ArrayList<CellPhone>cellphone= new ArrayList<CellPhone>();
		assertEquals(true, cellphone.add(new CellPhone("Redmi","12Mpcam,300Mah","note5","android",15000)));
		assertEquals(true, cellphone.add(new CellPhone("Sony","13Mpcam,300Mah","sony1","android",18000)));
		assertEquals(true, cellphone.add(new CellPhone("Samsung","15Mpcam,400Mah","samsungj7","android",17500)));
		assertEquals(3,cellphone.size());


	}
	
	@Test
	void testTelevision() {
		ArrayList<Television>tv= new ArrayList<Television>();
		assertEquals(true, tv.add(new Television("Sony","LED","yes",80000)));
		assertEquals(true, tv.add(new Television("LG","LCD","yes",90000)));
		assertEquals(true, tv.add(new Television("Panasonic","LED","yes",100000)));
		assertEquals(3,tv.size());

	}
	@Test
	void testSchool() {
		ArrayList<School>school= new ArrayList<School>();
		assertEquals(true, school.add(new School("SVBHS","Indhranagar","Rangareddy",1)));
		assertEquals(true, school.add(new School("Vista","Gandipet","Sangareddy",3)));
		assertEquals(true, school.add(new School("St.anns","Gachibowli","Rangareddy",5)));
		assertEquals(3,school.size());

	}
		
	}
