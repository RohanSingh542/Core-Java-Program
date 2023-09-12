package Program;

/* Find the average of largest and smallest numbers in the unsorted integer array. 
 * 
 *  Input case - [1,4,3,2] 
 *  output      - 2.5     
 *   Solution - average = (1+4)/2 = 5/2 = 2.5    */


public class Array_Largest_Smallest_Average {

	public static void main(String[] args) {
		int a[]= {1,4,3,4};
		int large=Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE;
		float sum=0.0f;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==small || a[i]==large)
			{
				sum=sum+a[i];
				count++;
			}
		}
		
		float avg=sum/count;
		System.out.println(avg);
	
	}

}
