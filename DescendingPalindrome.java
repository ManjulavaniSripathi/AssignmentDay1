package assignment1;
import java.util.Scanner;

public class DescendingPalindrome {
	private static Scanner sc;
	public static void main(String[] args) {
		
		String[] INPUT = new String[100];
		sc = new Scanner(System.in);
				System.out.println("Provide 10 input");
				for(int i=0; i<10; i++) {
					INPUT[i] = sc.nextLine();
	}	
	System.out.println("Final Palindromes are ");
	for(int i=0; i<10; i++) {
		if(palindrome(INPUT[i])) {
			alphaorder(INPUT[i]);
		}
	}
}
	
public static String Reverse(String string) {
	String rev = "";
	int i=string.length()-1;
	while(i >= 0) {
		rev = rev +string.charAt(i);
		i--;
	}
	return rev;
}
public static Boolean palindrome(String string) {
	if(string.equals(Reverse(string))) {
		return true;
	}
	return false;
}
	public static void alphaorder(String string) {
	char[] str=string.toCharArray();
	for(int i=0; i<str.length; i++) {
	for(int j=0; j<str.length-i-1; j++) {
		if(str[j] > str[j+1]) {
			char temp = str[j];
			str[j] = str[j+1];
			str[j+1] = temp;
		}
	}
}
	System.out.println(str);
	return;
	}
}