package com.day2;

public class Sentence {

		public static Object correction(String input, String word, int position) {
			// TODO Auto-generated method stub
			String fin="";
			int i;
			for(i=0;i<input.length()-1;i++)
			{
				if(input.charAt(i) == input.charAt(i+1) && input.charAt(i) == ' ')
				{
					
				}
				else
				{
					fin+=input.charAt(i);
				}
			}
			fin=fin+input.charAt(i);
			input=fin;
			fin="";
			int count=0;
			for(i=0;i<input.length();i++)
			{
				if(input.charAt(i) == ' ')
				{
					count++;
					if(count == (position-1))
					{
						fin = input.substring(0,  i+1)+input.substring(i+2+word.length());
					}
				}
				
			}
			return fin;
		}

	}


