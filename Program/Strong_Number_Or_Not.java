package Program;

import java.util.Scanner;

// WAP to check whether the number is strong number or not. 

/* A number is said to be a strong number, if the sum of factorials of the input numbers every digit is equal to the same input number.*/


public class Strong_Number_Or_Not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		int temp=n;
		int sum=0;
		while(temp!=0)
		{
			int d=temp%10;
			int fact=1;
			for(int i=1;i<=d;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(n==sum)
			System.out.println(n+" is a strong number");
		else
			System.out.println(n+" is not a strong number");

	}

}
