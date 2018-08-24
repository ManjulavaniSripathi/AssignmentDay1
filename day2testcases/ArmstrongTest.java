package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.Armstrong;

class ArmstrongTest {

	@Test
	void test() {
assertEquals(true,Armstrong.checkArmstrong(153));
assertEquals(false,Armstrong.checkArmstrong(152));
	}

}
