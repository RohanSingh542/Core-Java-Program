package Program;

import java.util.Scanner;

/* In a Science lab, the combination of two nuclear chemical produces an initial energy as X. This energy X changes at a consistent
 * rate R every second. The scientists wishes to calculate the energy produced at the N th second.
 * Write an algorithm to find the energy produced at the N th second.  
 * 
 * sample input:=  x=4, R=3, Nth=5 
 * Output := 16 */

public class Find_Energy_Produced_At_N_Time {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the second");
		int n=sc.nextInt();
		sc.close();
		int x=4;
		int r=3;
		for(int i=1;i<n;i++)
		{
			x=x+r;
		}
		System.out.println(x);

	}

}
