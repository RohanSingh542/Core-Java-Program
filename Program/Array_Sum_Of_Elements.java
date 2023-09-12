package Program;

// WAP to find the sum of all the elements of an array.

public class Array_Sum_Of_Elements {

	public static void main(String[] args) {
		int a[]= {4,5,8,7,9,5,1,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of elements: "+sum);

	}

}
