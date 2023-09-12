package Program;

/*    Given an array arr[] of integers find out the maximum difference between any two elements such that the larger element
 * appears after the smaller number.   
 *  
 *  Examples - Input : arr={2,3,10,6,4,8,1}
 *  		    Output : 8  
 *  	Explanation : The maximum difference is between 10 and 2. 
 *  
 *  		   Input : arr={7,9,5,6,3,2}
 *  			output : 2
 *  	Explanation : The maximum difference is between 9 and 7.
 *  */

public class Array_Difference_Between_Larger_and_Smaller_Element {

	public static void main(String[] args) {
		int a[]= {7,9,5,6,3,2};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]-a[i]>max)
				{
					max=a[j]-a[i];
				}
			}
		}
		System.out.println("The Maximum difference is: "+max);

	}

}
