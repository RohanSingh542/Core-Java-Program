package Program;

/* Given an array nums containing N distinct numbers in the range [0,N] return the only number in the range that is 
 * missing from the array.
 * 
 * Input:nums=[9,6,4,2,3,5,7,0,1]
 * Output : 8 
 * Explanation : N=9 since there are 9 numbers , so all numbers are in the range [0,9]. 8 is the missing number in the 
 * range. since it does not appear in the nums.
 *                                                                           */

public class Array_N_Disnict_Missing_Elements {

	public static void main(String[] args) {
		int n[]= {9,6,4,2,3,5,8,0,1};
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]>n[j])
				{
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}

		}
		for(int i=0;i<n.length;i++)
		{
			if(n[i]!=i)
			{
				System.out.println(i);
				break;
			}
		}
	}

}
