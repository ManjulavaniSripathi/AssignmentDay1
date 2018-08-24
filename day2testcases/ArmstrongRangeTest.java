package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.day2.ArmstrongRange;

class ArmstrongRangeTest {

	@Test
	void testfindAllArmstrongNumbers() {
 assertArrayEquals(new int[] {153,370,371,407},ArmstrongRange.findAllArmstrongNumbers(100,1000));
 assertArrayEquals(new int[] {152,371,407,401},ArmstrongRange.findAllArmstrongNumbers(100,1000));
	
		
	}

 
		
	}


