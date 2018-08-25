package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.day2.StudentMarks;

class AverageMarksTest {

		@Test
		void AverageMarksTest() {
			assertEquals(100, StudentMarks.calStudentSum(20,50,30),0.02);
			assertEquals(120.752, StudentMarks.calStudentSum(20.2,80.4,20.152),0.02);
			assertEquals(33.33, StudentMarks.calStudentAverage(20,50,30),0.02);
			assertEquals(30.0, StudentMarks.calStudentAverage(10,50,30),0.02);
			assertEquals(294, StudentMarks.calSubjectSum('a','b','c'),0.02);
			assertEquals(30, StudentMarks.calSubjectAverage(10,50,30),0.02);
		}

	}