package Program;

// WAP to print the factorial of a number.

/*  Factorial of a number is the product(multiplication) of all positive number(till 1) descending integer.
 * It is denoted by n! */

public class Factorial_Program {

	public static void main(String[] args) {
		int n=5;
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of a "+n+" is "+fact);

	}

}
