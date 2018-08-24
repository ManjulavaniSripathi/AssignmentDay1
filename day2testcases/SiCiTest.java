package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.SiCi;

class SiCiTest {

	@Test
	void test() {
		assertEquals(1.2,SiCi.siciOfAValue(50,2,1.2));
	}

}
