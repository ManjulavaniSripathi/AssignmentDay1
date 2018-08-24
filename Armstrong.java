package com.day2;

public class Armstrong {

	public static boolean checkArmstrong(int i) {
		int num = i;
		int rem = 0;
		int sum=0;
		while(num!=0) {
			rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
		}
		if(i==sum)
			return true;
		else
			return false;
	}
}

