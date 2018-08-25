package com.capgemini.day2testcases;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.MultiDimension;


class MultiDimensionTest {

	@Test
	void test() {
		assertEquals("found",MultiDimension.searchElement(new int[][] {{1,2},{3,4}}));
	}

}