package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.Palindrome;

class PalindromeTest {

	@Test
	void test() {
		assertEquals(true,Palindrome.checkPalindrome(12321));
		
    	}

}
