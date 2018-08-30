package com.capgemini.day6Testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;


import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;
import com.capgemini.day6.CellPhone;
import com.capgemini.day6.Laptop;
import com.capgemini.day6.School;
import com.capgemini.day6.Television;

public class HashSetTest {
@Test

void testLaptop() {
	
		 HashSet<Laptop> laptop= new HashSet<>();
		laptop.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5"));
			laptop.add(new Laptop("HP", "HP234", "Windows 10", "i3"));
			laptop.add(new Laptop("HP", "HP234", "Windows 10", "i3"));

		
		 for(Laptop l : laptop) {
			 System.out.println(l);
		 }
}
	@Test	
	void testCar() {
			 HashSet<Car> car= new HashSet<>();
		car.add(new Car("Bmw", "Bm34", 2013, 1000000));
		car.add(new Car("Innova", "Inn890", 2012, 2000000));
		car.add(new Car("Innova", "Inn890", 2012, 2000000));
	 
			
			 for(Car c : car) {
				 System.out.println(c);
		 }
	 }
	 
@Test
void testCellphone() {
	 HashSet<CellPhone> cellphone= new HashSet<>();
	 cellphone.add(new CellPhone("Redmi","12Mpcam,300Mah","note5","android",15000));
	 cellphone.add(new CellPhone("Sony","13Mpcam,300Mah","sony1","android",18000));
	 cellphone.add(new CellPhone("Sony","13Mpcam,300Mah","sony1","android",18000));

			
			 for(CellPhone c : cellphone) {
				 System.out.println(c);
		 }
	 }
@Test
void testTelevision() {
	 HashSet<Television> tv= new HashSet<>();
		 tv.add(new Television("Sony","LED","yes",80000));
		 tv.add(new Television("LG","LCD","yes",90000));
		 tv.add(new Television("LG","LCD","yes",90000));

			
			 for(Television t : tv) {
				 System.out.println(t);
		 }
	 }
@Test
void testSchool() {
	 HashSet<School> school= new HashSet<>();
		 school.add(new School("SVBHS","Indhranagar","Rangareddy",1));
	     school.add(new School("Vista","Gandipet","Sangareddy",3));
	     school.add(new School("Vista","Gandipet","Sangareddy",3));

		 for(School s : school) {
			 System.out.println(s);
	
}
	
}
}
	





	