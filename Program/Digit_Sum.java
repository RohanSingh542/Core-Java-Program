package Program;

import java.util.Scanner;

// WAP to find the sum of digits of a number.

public class Digit_Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("Sum of digits is "+sum);

	}
}
