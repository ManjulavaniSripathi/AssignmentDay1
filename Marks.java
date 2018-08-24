package com.day2;

public class Marks {
	
	public static String findGrade(int maths, int science, int social ) {
	if(maths>60 && science>60 && social>60)
		return("Passed");
		else if((maths>60 && science>60)||science>60 && social>60||(social>60 && maths>60))
	return("Promoted");
	else
		return("Fail");
	
	}
	

}
