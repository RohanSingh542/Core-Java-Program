package Program;

import java.util.Scanner;

// WAP to convert a number decimal to binary.

public class Decimal_To_Binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		String bin="";
		while(n!=0)
		{
			int rem=n%2;
			bin=rem+bin;
			n=n/2;
		}
		System.out.println(bin);

	}

}
