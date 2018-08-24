package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.day2.Discount;

class DiscountTest {
	@Test
	void test () {
		assertEquals(65.0,Discount.findDiscount(100));
	}
}

	