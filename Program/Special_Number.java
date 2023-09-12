package Program;

import java.util.Scanner;

/* Special number is a number that is equal to the integer product of digits and sum of digits of a number.
 * number = sum of digits + product of digits    */

public class Special_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		int temp=n;
		int sum=0,pro=1;
		
		while(temp!=0)
		{
			int d=temp%10;
			sum=sum+d;
			pro=pro*d;
			temp=temp/10;
		}
		if(n==(sum+pro))
			System.out.println(n+" is a special number");
		else
			System.out.println(n+" is not a special number");

	}

}
