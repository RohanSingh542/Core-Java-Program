package Program;

import java.util.Scanner;

/* Daksh loves mathematics more than he loves his cold drinks and chips. One fine day while strolling through the Learning Resource Centre
 * he found an interesting book on Harshad Numbers. A harshad number(or Niven Number) is an integer that is divisible by the sum of its 
 * digits.
 * 
 * Example :- num=200 then digitsum(num) = 2+0+0=2 as 200 % digitsum(num) is 0, 200 is a harshad number.
 * 
 * Help Daksh to create a logic to check if the number is harshad number.   */


public class Harshad_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		int harsh= n%digitsum(n);
		if(harsh==0)
			System.out.println(n+" is a harshad number");
		else
			System.out.println(n+" is not a harshad number");
	}
	public static int digitsum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		return sum;
	}

}
