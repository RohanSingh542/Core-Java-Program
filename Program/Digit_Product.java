package Program;

import java.util.Scanner;

// WAP to find the product of digit of a number.

public class Digit_Product {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		int pro=1;
		while(n!=0)
		{
			int d=n%10;
			pro=pro*d;
			n=n/10;
		}
		System.out.println("The product of digit is "+pro);
	}

}
