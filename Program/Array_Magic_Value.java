package Program;

/*  You are given a comprising N integers. You have to calculate the magic Value of the array A. 
 * Magic value of an array is equal to the differance between the sum of good integers in an array
 * and the sum of the bad integers in an array.
 *    Good integers are the ones whose indexes are not changed in an array when sorted, rest are bad.
 *  */

public class Array_Magic_Value {

	public static void main(String[] args) {
		int a[]= {0,4,0,0,1,3,4,1,0,2};
		int b[]= new int [a.length];
		
		// creating copy of array
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		// Sorting the array a
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		// Comparing the indexes and finding good and bad integer
		int goodSum=0;
		int badSum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				goodSum=goodSum+b[i];
			}
			else
			{
				badSum=badSum+b[i];
			}
		}
		System.out.println("Magic Value- "+(goodSum-badSum));

	}

}
