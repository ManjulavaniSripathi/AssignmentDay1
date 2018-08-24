package com.day2;

public class SiCi {
	public static double siciOfAValue(int p, int t, double r) {
		 double sim;
		 double com;
		sim = (p*  t * r)/100;
		com = p*Math.pow((1.0+r)/100,t)-p;
		
		return sim;
		
	}

}
