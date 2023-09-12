package Program;

// WAP to find the largest element of the matrix array.

public class Array_Largest_Element_Of_Matrix {

	public static void main(String[] args) {
		int a[][]= {{10,60,45},{100,83,74},{99,90,69}};
		int large=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>large)
				{
					large=a[i][j];
				}
			}
		}
		System.out.println("Largest Element "+large);

	}

}
