package Program;

import java.util.Scanner;

// WAP to print the Odd digit of a number.

public class Digit_Odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		while(n!=0)
		{
			int d=n%10;
			if(d%2!=0)
			{
				System.out.println(d);
			}
			n=n/10;
		}

	}

}
