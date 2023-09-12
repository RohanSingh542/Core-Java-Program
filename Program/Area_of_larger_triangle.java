package Program;

import java.util.Scanner;

/* Jackson a math research student is developing an application on triangle in mensuration. For the two triangle on the application
 * display with base and height given the user must identify the triangle with the largest area, jackson must now write an algorithm
 * to find the area of the larger triangle.
 * To find the area of a triangle with base and height given the following formula is used.
 * Area of triangle=(base*height)/2 . 
 * Sample input :- 
 * 5
 * 8
 * 4
 * 11
 * Ouput:- 22.0 */

public class Area_of_larger_triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base of triangle");
		int b1=sc.nextInt();
		System.out.println("Enter the height of triangle");
		int h1=sc.nextInt();
		System.out.println("Enter the basse of triangle");
		int b2=sc.nextInt();
		System.out.println("Enter the height of triangle");
		int h2=sc.nextInt();
		sc.close();
		float area1=(b1*h1)/2.0f;
		float area2=(b2*h2)/2.0f;
		float larger=area1>area2?area1:area2;
		System.out.println(larger);

	}

}
