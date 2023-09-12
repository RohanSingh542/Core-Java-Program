package Program;

import java.util.Scanner;

// WAP to display the arithmetic progression from taking input from the user.

/* An arithmetic progression is a sequence of numbers such that the difference from any succeeding terms
 * to its preceeding terms remains constant.  */


public class Arithmetic_Progression_Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the begining number of series");
		int a=sc.nextInt();
		System.out.println("Enter the difference between the number of series");
		int d=sc.nextInt();
		System.out.println("Enter the number of terms ");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			a=a+d;
		}

	}

}
