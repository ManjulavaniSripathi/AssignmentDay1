package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.IncomeTax;

class IncomeTaxTest {

	@Test
	void testCheckIncomeTax() {
		assertEquals(0,IncomeTax.checkIncomeTax(100000));
		assertEquals(20000,IncomeTax.checkIncomeTax(200000));
		assertEquals(80000,IncomeTax.checkIncomeTax(400000));
		assertEquals(180000,IncomeTax.checkIncomeTax(1000000));

	}

}
