package assignment1;

import java.util.Scanner;

public class Multidimensional {


	public static void main(String[] args) {
    	int s1,flag=0;
    	int[][] num= {{1,2,3,4,},{2,3,4,5},{3,4,5,6}};
    	Scanner inp=new Scanner(System.in);
        System.out.println("Enter the number to be searched in an array format for 2 dimensional array:");
    	s1=Integer.parseInt(inp.next());
    	inp.close();
    	
    	for(int i=0;i<num.length;i++)
    	{
    		for(int j=0;j<num[i].length;j++)
    		{
    		if(s1==num[i][j])
    			flag=1;
    		}
    	}
    	if(flag==1)
    		System.out.println("Yes Present");
    	else
    		System.out.println("Not Present");
    }
}
      
 