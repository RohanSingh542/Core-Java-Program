package Program;

// WAP to merge the two array in one.

public class Array_Merge {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {11,12,13,14,15};
		int c[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[k]=b[i];
			k++;
		}
		for(int i:c)
		{
			System.out.print(i+" ");
		}

	}

}
