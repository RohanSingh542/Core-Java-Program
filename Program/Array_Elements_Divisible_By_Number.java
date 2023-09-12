package Program;

import java.util.Scanner;

/* You are given an array A of size N and an integer K. You have to make all the elements of the array divisible by K.
 *  You can decrease any element of the array by 1 in one operation.
 *  Find the total number of decrement operations required to make all the elements of the array divisible by k. 
 *  
 *  Sample Input:- 5 6 ----denotes N & k
 *                 5 9 12 16 25 ----denotes N elements   
 *     Output :-    13                                                             */


public class Array_Elements_Divisible_By_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		System.out.println("Enter the number divisible by all elements");
		int k=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i]%k;
		}
		System.out.println("Total number of decrement operation required: "+sum);

	}

}
