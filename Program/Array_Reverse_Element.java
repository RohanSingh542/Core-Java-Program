package Program;

// WAP to do reverse of element of an array.

public class Array_Reverse_Element {

	public static void main(String[] args) {
		int a[]= {5,12,44,16,52,74};
		int b[]=new int[a.length];
		for(int i=0,j=a.length-1;i<a.length;i++,j--)
		{
			b[i]=a[j];
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		// Second Approach by doing swapping

		for(int i=0,j=a.length-1;i<a.length/2;i++,j--)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
