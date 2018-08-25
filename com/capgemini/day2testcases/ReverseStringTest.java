package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.ReverseString;

class ReverseStringTest
{

	@Test
	void testReverseString() 
	{
		assertEquals("ujnam ",ReverseString.reverseStringTest("manju"));
	}
}