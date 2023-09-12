package Program;

import java.util.Scanner;

/*  You are playing an online game. In the game a list of N numbers is given. The player hass to arrange the numbers
 * so that all the odd number of the list come after the even numbers.
 *  Write an algorithm to arrange the given list such that all the odd numbers of the list come after the even numbers.   */

public class Array_Arrange_List_Of_Element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element of an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		
		int b[]=new int [a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[k]=a[i];
				k++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				b[k]=a[i];
				k++;
			}
		}
		// to print the array
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}

	}

}
