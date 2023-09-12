package Program;

// WAP to print all even elements using do while loop.

public class Array_Even_Elements_Print {

	public static void main(String[] args) {
		int a[]= {4,3,5,2,7,6};
		int i=0;
		do
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
			i++;
		}
		while(i<a.length);

	}

}
