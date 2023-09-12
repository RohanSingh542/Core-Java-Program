package Program;

// WAP to find the second largest element of an array.

public class Array_Second_Largest_Element {

	public static void main(String[] args) {
		int a[]= {11,15,25,44,77,77,45};
		int large=Integer.MIN_VALUE;
		int slarge=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				slarge=large;
				large=a[i];
			}
			else if(a[i]>slarge && large!=a[i] )
			{
				slarge=a[i];
			}
		}
		System.out.println("Largest element of an array is "+large);
		System.out.println("Second Largest element of an array is "+slarge);

	}

}
