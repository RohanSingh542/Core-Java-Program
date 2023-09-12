package Program;

// WAP to find the largest element of an array.

public class Array_Largest_Element {

	public static void main(String[] args) {
		int a[]= {104,65,87,55,94,24};
		int large=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
		}
		System.out.println("Largest element of an array is "+large);

	}

}
