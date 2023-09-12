package Program;

// WAP to print all the odd elements of an array.

public class Array_Odd_Elements_Print {

	public static void main(String[] args) {
		int a[]= {4,3,2,5,7,6};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}

	}

}
