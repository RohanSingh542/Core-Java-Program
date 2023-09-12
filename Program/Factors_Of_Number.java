package Program;

import java.util.Scanner;

// WAP to find the factors of a number.

/* A factor of a number is a number that divides the given number excatly leaving no remainder. */

public class Factors_Of_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}

	}

}
