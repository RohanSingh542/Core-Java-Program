package Program;

import java.util.Scanner;

// WAP to count the number of niven number in the range of user given.

public class Niven_Number_Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int f=sc.nextInt();
		System.out.println("Enter the second number");
		int s=sc.nextInt();
		sc.close();
		int count=0;
		for(;f<=s;f++)
		{
			int sum=0;
			int temp=f;
			while(temp!=0)
			{
				int d=temp%10;
				sum=sum+d;
				temp=temp/10;
			}
			if(f%sum==0)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
