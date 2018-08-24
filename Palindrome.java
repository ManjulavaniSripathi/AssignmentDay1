package com.day2;

public class Palindrome {

	public static Object checkPalindrome(int num) {
		
		int revint=0,rem;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			revint=(revint*10)+rem;
			num=num/10;
	
		}
		if(temp==revint)
			return true;
		else 
			return false;
		
	}

}
