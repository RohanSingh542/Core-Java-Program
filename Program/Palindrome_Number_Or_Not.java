package Program;

import java.util.Scanner;

// WAP to check wheter the number is palindrome or not.

/* A Palindrome number is a number that remains the same when its digits are reversed. */


public class Palindrome_Number_Or_Not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		int temp=n;
		int rev=0;
		while(temp!=0)
		{
			int d=temp%10;
			rev=rev*10+d;
			temp=temp/10;
		}
		if(n==rev)
			System.out.println(n+" is a palindrome number");
		else
			System.out.println(n+" is not a palindrome number");

	}

}
