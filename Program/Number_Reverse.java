package Program;

import java.util.Scanner;

// WAP to reverse a number.

public class Number_Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		int rev=0;
		while(n!=0)
		{
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		System.out.println(rev);

	}

}
