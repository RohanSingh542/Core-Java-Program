package Program;

import java.util.Scanner;

// WAP to count the total digits present in the number. 

public class Digit_Total_Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		int count=0;
		while (n!=0)
		{
			count++;
			n=n/10;
		}
		System.out.println(count);

	}

}
