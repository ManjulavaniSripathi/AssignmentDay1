package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.Marks;

class MarksTest {
	

	@Test
	void test()
	{
		assertEquals("Passed",Marks.findGrade(61,70,80));
		assertEquals("Promoted",Marks.findGrade(70,80,40));
		assertEquals("Fail",Marks.findGrade(50,40,55));
		
	}

}
