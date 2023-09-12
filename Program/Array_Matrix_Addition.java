package Program;

// WAP to add two matrix of 3 row and coloumns.

public class Array_Matrix_Addition {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{6,5,4},{7,8,9}};
		int b[][]= {{2,4,6},{8,10,12},{14,16,18}};
		int c[][]= new int[a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
