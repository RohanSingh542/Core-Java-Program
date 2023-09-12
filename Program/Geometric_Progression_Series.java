package Program;

import java.util.Scanner;

// WAP to display the geometric progression series taking input from the user.

/* A geometric progression is a progression the ratio of any term and its previous term is equal to a fixed constant.
 * It is a special type of progression. */


public class Geometric_Progression_Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the ratio of the number");
		int r=sc.nextInt();
		System.out.println("Enter the number of terms");
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			a=a*r;
		}

	}

}
