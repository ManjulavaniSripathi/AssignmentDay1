package assignment1;
import java.util.*;
import java.io.*;


public class Password {
	private static Scanner sc;

	public static void main(String[] args) throws IOException{
		sc = new Scanner(System.in);
		String u="manju";
		String p="manju135";
		int count=0;
		while(count<3)
		{
			System.out.println("Enter username");
			String username=sc.nextLine();
			System.out.println("Enter password");
			String pw=sc.nextLine();
			if(u.equals(username)&&p.equals(pw)) {
				System.out.println("Welcome");
				return;
			}
			else {
				count++;
				if(count!=3) System.out.println("Wrong username or password. Enter again");
				
			};
		}
		if(count==3)
			System.out.println("Contact Admin");;
			
		
			
	}}