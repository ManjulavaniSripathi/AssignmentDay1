package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Deleteword {
	
public static void main(String[] args) throws IOException {
	int i,j;
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Give the Input");
	String s=in.readLine();
	String word[]=s.split(" ");
	int x=word.length;

	for(i=0;i<x;i++)
	{
		if(word[i]!=null)
		{
			for(j=i+1;j<x;j++)
			{
				if(word[i].equals(word[j]))
				{
					word[j]=null;
				}
			}
		}
	}
	for (int k=0;k<x;k++)
	{
		if(word[k]!=null)
		{
			System.out.println(word[k]+" ");
			
		}
	}
	
	
}
}
