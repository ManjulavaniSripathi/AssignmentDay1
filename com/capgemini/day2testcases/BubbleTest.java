package com.capgemini.day2testcases;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.Bubble;

	class BubbleTest {

		@Test
		void testBubblesort() {
			
			assertArrayEquals(new int[] {1,5,6,7,12,14,19,23,26,35,37,47,52,78,86},Bubble.Bubblesort(new int[] {1,5,12,14,6,78,19,23,26,35,37,7,52,86,47}));
		}

	}