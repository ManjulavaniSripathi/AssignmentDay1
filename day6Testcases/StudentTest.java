package com.capgemini.day6Testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Laptop;
import com.capgemini.day6.School;
import com.capgemini.day6.Student;

class StudentTest {
	@Test
	void testStudent() {
		
		LinkedList<Student> student=new LinkedList<>();
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

