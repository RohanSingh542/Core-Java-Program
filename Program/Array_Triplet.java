package Program;

/*  Find the triplet with the given sum in an array. Given an unsorted integer array.
 * find the triplet with a given sum in it. 
 * 
 * For example - Input: nums=[2,7,4,0,9,5,1,3] 
 *                target = 6 
 *                Output : 0,1,5  0,2,4  1,2,3    
 *                                                                 */

public class Array_Triplet {

	public static void main(String[] args) {
		int a[]= {2,7,4,0,9,5,1,3};
		int target=6;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==target)
					{
						System.out.print(a[i]+" "+a[j]+" "+a[k]+" ");
						System.out.print("   ");
					}
				}
				
			}
		}

	}

}
