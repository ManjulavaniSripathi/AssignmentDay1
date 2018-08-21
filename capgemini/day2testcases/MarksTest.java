package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.Marks;

class MarksTest {
	

	@Test
	void test()
	{
		assertEquals("passed",Marks.resultOfAStudent(70,90,80));
		
	}

}
