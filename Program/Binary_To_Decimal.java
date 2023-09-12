package Program;

import java.util.Scanner;

// WAP to convert binary number to decimal number.

public class Binary_To_Decimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number");
		int n=sc.nextInt();
		sc.close();
		
		int sum=0;
		int power=1;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d*power;
			power=power*2;
			n=n/10;
		}
		System.out.println(sum);

	}

}
