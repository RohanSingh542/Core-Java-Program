package Program;

import java.util.Scanner;

// WAP to find the digit of a number.


/* Digits are the single symbols used to represent numbers in maths. 
 * For example , in number 89 , 8 and 9 are two digits.
 * Hence , the numerals such as 0,1,2,3,4,5,6,7,8,9 are the form of digits which are used to represent a combination of numbers. */

public class Digit_Of_A_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		while(n!=0)
		{
			int d=n%10;
			System.out.println(d);
			n=n/10;
		}

	}

}
