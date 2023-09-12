package Program;

import java.util.Scanner;

/*  Given a positive integer number return true if number is a perfect square or false otherwise.
 *   A perfect square is an integer that is the square of an integer. In other words it is the product of same integer with iself. */

public class Perfect_Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		sc.close();
		System.out.println(perfect(num));

	}
	public static boolean perfect(int num)
	{
		boolean flag=false;
		for(int i=1;i*i<=num;i++)
		{
			if(i*i==num)
			{
				flag=true;
				break;
			}
		}
		return flag;
		
	}

}
