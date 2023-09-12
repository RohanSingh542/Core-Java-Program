package Program;

import java.util.Scanner;

// WAP to print the table of a number without using loop.

public class Table_Without_Using_Loop {
	static int i=1;
	
	public static void table(int n)
	{
		if(i<=10)
		{
			System.out.println(n+" X "+i+" = "+i*n);
			i++;
			table(n);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table number");
		int n=sc.nextInt();
		sc.close();
		table(n);

	}
	

}
