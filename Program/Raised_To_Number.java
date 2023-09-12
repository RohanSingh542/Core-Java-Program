package Program;

import java.util.Scanner;

// WAP to find the result of number raised to power.

public class Raised_To_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Enter the number raised to");
		int p=sc.nextInt();
		sc.close();
		
		int pow=1;
		for(int i=1;i<=p;i++)
		{
			pow=pow*n;
		}
		System.out.println(n+" raised to "+p+" is "+pow);

	}

}
