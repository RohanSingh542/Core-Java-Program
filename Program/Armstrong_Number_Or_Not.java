package Program;

import java.util.Scanner;

// WAP to find if the number is armstrong number or not.


/* Armstrong number are the numbers having the sum of digits raised to power number of digits is equal to a given number.  */


public class Armstrong_Number_Or_Not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		int temp=n;
		int p=countOfDigits(n);
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+power(d,p);
			n=n/10;
		}
		if(temp==sum)
			System.out.println(temp+" is a armstrong number");
		else
			System.out.println(temp+" is not a armstrong number");

	}
	public static int countOfDigits(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	
	public static int power(int n,int p)
	{
		int pow=1;
		for(int i=1;i<=p;i++)
		{
			pow=pow*n;
		}
		return pow;
	}

}
