package Program;

import java.util.Scanner;

// WAP to find the largest digit from the given number.

public class Digits_LargestDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		int large=0;
		while(n!=0)
		{
			int d=n%10;
			if(d>large)
			{
				large=d;
			}
			n=n/10;
		}
		System.out.println(large);

	}

}
