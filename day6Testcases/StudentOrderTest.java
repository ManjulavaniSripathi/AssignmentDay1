package com.capgemini.day6Testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Student;

class StudentOrderTest {
	@Test
	void testStudentOrderTest() {
		TreeSet<Student> student=new TreeSet<>();
		student.add(new Student("Manju",1233,"IT"));
		student.add(new Student("Madhav",1234,"CSE"));
		student.add(new Student("Srikanth",1235,"ECE"));
		student.add(new Student("Sandy",1237,"ECE"));
		student.add(new Student("Mandy",1237,"ECE"));


		 for(Student s : student) {
			 System.out.println(s);
		 }
	}
}
	



	