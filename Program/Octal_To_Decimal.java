package Program;

import java.util.Scanner;

// WAP to convert octal number to decimal number.

public class Octal_To_Decimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the octal number");
		int n=sc.nextInt();
		sc.close();
		
		int sum=0;
		int power=1;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+power*d;
			power=power*8;
			n=n/10;
		}
		System.out.println(sum);

	}

}
