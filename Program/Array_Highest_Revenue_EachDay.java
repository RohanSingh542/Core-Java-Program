package Program;

/*
 *  A company hass a sales record of N products for M days. The company wishes to know the maximum revenue received from a given product
 *  of the N products each day.
 *   Write an algorithm to find the highest revenue received each day.
 *   
 *   Input - 
 *   		The first line of the input consists of two space-separated integers days and products representing the days(M)
 *   		and the products in the sales record (N) respectively.
 *   		The next M lines consists of N space-separated integers. SalesRecord representing the grid of sales revenue
 *   		(can be positive or negative) received from each product each day.
 *   		3 4
 *   		100 198 333 323
 *   		122 232 221 111
 *   		223 565 245 764
 *   
 *  Output - Print M space-separated integers representing the maximum revenue received each day.
 *  		 333 232 764
 *  */
public class Array_Highest_Revenue_EachDay {

	public static void main(String[] args) {
		int a[][]= {{100,198,333,323},{122,232,221,111},{223,565,245,764}};
		for(int i=0;i<a.length;i++)
		{
			int large=Integer.MIN_VALUE;
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>large)
				{
					large=a[i][j];
				}
			}
			System.out.print(large+" ");
		}

	}

}
