package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.day2.MissingElementCheck;





class MissingElementCheckTest {
	@Test
	void test() {
		assertEquals(3,MissingElementCheck.checkforTheMissingelement(new int[] {1,2,4,5,6}));
	}
}

	