package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.day2.CheckOccurence;



class CheckOccurenceTest {
	@Test
	void test() {
		assertEquals(7,CheckOccurence.findNumbeOfOccurences(new String[] {"Sam", "Priya","Mali","Raj","Ram","George","Sam"}, new String("Sam")));
		
	}
}

	