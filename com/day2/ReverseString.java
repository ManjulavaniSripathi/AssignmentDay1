package com.day2;

public class ReverseString {

		public static String reverseStringTest(String string)
		{
			// TODO Auto-generated method stub
			String ans = "";
			String str2[]=string.split(" ");
			for(int i=0;i<str2.length;i++)
			{
				String rev="";
				for(int j=str2[i].length()-1;j>=0;j--)
				{
					rev=rev+str2[i].charAt(j);
				}
				ans=ans+rev+" ";
			}
		return ans;
		}
	}