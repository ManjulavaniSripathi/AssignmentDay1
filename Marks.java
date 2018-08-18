package assignment1;
import java.util.*;
public class Marks {
	private static Scanner sc;

	public static void main(String args[]) {
		sc = new Scanner(System.in);
		int S1,S2,S3;
		System.out.println (" Enter the marks of S1: ");
		S1=sc.nextInt();
		System.out.println(" Enter the marks of S2: ");
		S2=sc.nextInt();
		System.out.println(" Enter the marks of S3: ");
		S3=sc.nextInt();
		if(S1>60 && S2>60 && S3>60)
			System.out.println("Result is Passed");
		else if(S1>60 && S2>60 || S2>60 && S3>60 || S3>60 && S1>60)
			System.out.println("Result is Promoted");
		else if(S1<60 && S2<60 || S1<60 && S3<60 || S2<60 && S3<60)
			System.out.println("Result is Failed");
		}

}
