package Program;

import java.util.Scanner;

// WAP to check whether the number is prime or not.

/* Prime Number is a number which is divisible by 1 and itself is known as prime number. It has 2 factors only. */

public class Prime_Number_Or_Not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		int count=0; // to store the factors of a number
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==2) // checking count of factors
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}

	}

}
