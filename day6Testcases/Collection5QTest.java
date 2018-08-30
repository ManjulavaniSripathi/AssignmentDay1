package com.capgemini.day6Testcases;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;

import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	import org.junit.jupiter.api.Test;
	class Collection5QTest {

	@Test
	void CarTest() {
		ArrayList<Car> car=new ArrayList<Car>();
		assertEquals(true, car.add(new Car("tata","nano",2005,300000)));
		assertEquals(true, car.add(new Car("bmw","x5",2006,1000000)));
		assertEquals(true, car.add(new Car("hyundai","santro",2009,700000)));
		System.out.println(car);
	}
	}


	