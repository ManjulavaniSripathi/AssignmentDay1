package assignment1;

import java.util.*;
public class Square
{
	private static Scanner sc;

	public static void main (String args[])
	{
		sc = new
		Scanner(System.in);
		int num;
		System.out.println("Enter an integer number:");
		num=sc.nextInt();
		System.out.println("Square of "+ num + " is: "+Math.pow(num,2));
	}
}