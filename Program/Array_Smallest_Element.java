package Program;

// WAP to find the smallest element of an array.

public class Array_Smallest_Element {

	public static void main(String[] args) {
		int a[]= {54,88,95,12,-1,65,78};
		int small=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println("Smallest element of an array is "+small);

	}

}
