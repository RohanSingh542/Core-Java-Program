package Program;

import java.util.Scanner;

// WAP to convert the decimal number to octal number.

public class Decimal_To_Octal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		String oct="";
		while(n!=0)
		{
			int rem=n%8;
			oct=rem+oct;
			n=n/8;
		}
		System.out.println(oct);

	}

}
