package Program;

/*  Find the counts of elements of an unsorted integer array which are equal to the average of all elements of that array.   */


public class Array_Counts_Of_Elements_Equal_Average_Elements {

	public static void main(String[] args) {
		int a[]= {2,2,2,2,2};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int avg=sum/a.length;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==avg)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
