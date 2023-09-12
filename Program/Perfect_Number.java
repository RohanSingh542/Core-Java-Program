package Program;

import java.util.Scanner;

// WAP to find the perfect number.

/* A perfect number is a positive integer that is equal to the sum of its positive divisor excluding the number itself.  */

public class Perfect_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
			System.out.println(n+" is a perfect number");
		else
			System.out.println(n+" is not a perfect number");

	}

}
