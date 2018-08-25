package com.capgemini.day2testcases;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.day2.Sentence;



class SentenceTest {

	@Test
	void test() {
		assertEquals("this is a sentence", Sentence.correction("this is is a sentence","is",3));
	}

}