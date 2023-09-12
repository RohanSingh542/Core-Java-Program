package Program;

// WAP to find the multiplication of two matrix of an array.

public class Array_Multiplication_Of_Matrix {

	public static void main(String[] args) {
		int a[][]= {{1,2,4},{2,2,3},{4,1,3}};
		int b[][]= {{2,2,3},{5,6,3},{2,1,3}};
		int c[][]=new int[a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=0;
				for(int k=0;k<a[i].length;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[j][k];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
