package Program;

import java.util.Scanner;

// WAP to find the highest common factor between two numbers.

/* HCF of two numbers is the highest possible number that divides both the numbers completely.
 * The HCF is also called as Greatest Common Divisor (GCD). */

public class Highest_Common_Factor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		sc.close();
		
		int hcf=highestCommonFactor(a,b);
		System.out.println("The highest common factor of "+a+", "+b+" is "+hcf);

	}
	public static int highestCommonFactor(int a,int b)
	{
		int hcf=0;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				hcf=i;
			}
		}
		return hcf;
	}

}
