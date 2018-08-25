package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.AbsoluteDifference;


public class AbsoluteDifferenceTest {

	@Test
	void testfindAbsoluteDifference() {
		assertEquals(1,AbsoluteDifference.findAbsoluteDifference(8,new int[]{1,2,3,4,5,4,3,2},5));
	}
}