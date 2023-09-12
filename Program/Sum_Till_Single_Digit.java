package Program;

import java.util.Scanner;

//WAP to find the sum of all the digit in the number until sum is a single digit number.

public class Sum_Till_Single_Digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		int sum=sumofdigit(n);
		System.out.println(sum);

	}
	public static int sumofdigit(int n)
	{
		int sum=0;
		while(n>0 || sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
	}

}
