package assignment1;

import java.util.Scanner;

public class Palindrome {
	private static Scanner sc;
	
	
	public static void main(String args[])
	{
		int n, temp, sum=0, r;
		sc = new Scanner(System.in);
		System.out.println("enter a number:");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("True");
		}
		else if(n<0)
		{
			System.out.println("False");
		}
		else
			System.out.println("False");
	}
}