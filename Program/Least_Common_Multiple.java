package Program;

import java.util.Scanner;

// WAP to find the LCM of a two number.

/* The Least Common Multiple (LCM) of two numbers is the lowest number that can be divisible by both number .
 * Formula :- LCM=(n1*n2)/HCF(n1,n2)   */

public class Least_Common_Multiple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		sc.close();
		
		int lcm=(a*b)/hcf(a,b);
		System.out.println("The LCM of "+a+", "+b+" is "+lcm);

	}
	public static int hcf(int a,int b)
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
