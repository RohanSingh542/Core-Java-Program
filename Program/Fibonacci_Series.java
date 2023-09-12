package Program;

import java.util.Scanner;

//WAP to print the fibonacii series taking the terms from the user.

/* The fibonacci series is a type of series where each number is the sum of the last two preciding(terms) . 
 * It starts usually from 0 and 1 . */

public class Fibonacci_Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int n=sc.nextInt();
		sc.close();
		int a=0, b=1, c=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println();
		
		// Second Way
		
		int x=0,y=1;
		System.out.print(x+" "+y);
		for(int i=1;i<=n-2;i++)
		{
			int d=x+y;
			System.out.print(" "+d);
			x=y;
			y=d;
		}

	}

}
