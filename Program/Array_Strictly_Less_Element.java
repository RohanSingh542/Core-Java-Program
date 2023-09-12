package Program;

/* You are given a list of integers and an integer k. 
 * Write an algorithm to find the number of elements in the list that are strictly less than k.  */

public class Array_Strictly_Less_Element {

	public static void main(String[] args) {
		int a[]= {12,54,88,-6,74,-7,15};
		int k=-5;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<k)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
