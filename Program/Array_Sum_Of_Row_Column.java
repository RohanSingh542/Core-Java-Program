package Program;

/* 
 * Consider a square matrix A of size N x N and an integer X which is an element of A.
 * find the row number R and column number C of X in A and calculate the sum of R and C. If the sum is even 
 * Find the sum of the digits of all even number in the matrix, and if the sum is odd then find the sum of digits 
 * of all odd numbers in the matrix.
 * 
 * Input - 3 
 * 		   11 22 33
 * 		   44 55 66
 * 		   77 88 99
 *         55                
 *  */
public class Array_Sum_Of_Row_Column {

	public static void main(String[] args) {
		int a[][]= {{11,22,33},{44,55,66},{77,88,99}};
		int x=22;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==x)
				{
					sum=i+j;
					break;
				}
			}
		}
		int add=0;
		if(sum%2==0)
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					if(a[i][j]%2==0)
					{
						add=add+sumofdigit(a[i][j]);
					}
				}
			}
			System.out.println("Sum of all even digit is: "+add);
		}
		else
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					if(a[i][j]%2!=0)
					{
						add=add+sumofdigit(a[i][j]);
					}
				}
			}
			System.out.println("Sum of all odd digit is: "+add);
		}

	}
	public static int sumofdigit(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		return sum;
	}

}
