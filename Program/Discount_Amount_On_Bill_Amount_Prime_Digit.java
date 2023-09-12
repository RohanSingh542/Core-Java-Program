package Program;

import java.util.Scanner;

/* An E-commerce company plans to give their customers a special discount for the holiday. They are planning to offer a flat discount.
 * The discount value is calculated as the sum of all the prime digits in the total bill amount. 
 *    Write an algorithm to find the discount value for the given total bill amount. 
 * 
 * Input :- The input consist of integer orderValue representing the total bill amount.
 * 
 * Output :- Print an integer representing the discountValue of the given total bill amount.
 * 
 * 
 * Example :-  input- 578
 *             output - 12         */


public class Discount_Amount_On_Bill_Amount_Prime_Digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total bill amount");
		int bill=sc.nextInt();
		sc.close();
		
		int sum=primeDigits(bill);
		System.out.println(sum);

	}
	public static int primeDigits(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			int count=0;
			for(int i=1;i<=d;i++)
			{
				if(d%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				sum=sum+d;
			}
			n=n/10;
		}
		return sum;
	}

}
