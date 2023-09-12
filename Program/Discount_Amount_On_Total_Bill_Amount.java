package Program;

import java.util.Scanner;

/* An E-commerce company plans to give their customers a discount for the New Years holiday. The discount will be calculated
 * on the basis of the bill amount of the order placed. The discount amount is the product of the sum of all odd digits and 
 * the sum of all even digits of the customers total bill amount. If no odd digit or even digit is present in the bill amount
 * then 0 will be consider for its corresponding sum.
 * 
 * Write an algorithm to find the discount amount for the given total bill amount. 
 * 
 * Input :- The input consists of an integer billAmount, representing the total bill amount of a customer. 
 * Output :- Print an integer representing the discount amount for the given total bill.
 * 
 * Constraints :-  0 < billAmount <= 10^9 
 * 
 * Example :- input - 2514795 
 *            output - 162              */


public class Discount_Amount_On_Total_Bill_Amount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total bill amount");
		int bill=sc.nextInt();
		sc.close();
		
		int dis=digits(bill);
		System.out.println(dis);

	}
	public static int digits(int n)
	{
		int esum=0,osum=0,pro=1;
		while(n!=0)
		{
			int d=n%10;
			if(d%2==0)
			{
				esum=esum+d;
			}
			else
			{
				osum=osum+d;
			}
			n=n/10;
		}
		pro=esum*osum;
		return pro;
	}

}
