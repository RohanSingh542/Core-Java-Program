package Program;

// WAP to find the third smallest element of an array.

public class Array_Third_Smallest_Element {

	public static void main(String[] args) {
		int a[]= {10,10,15,17,16,20};
		int firstSmall=Integer.MAX_VALUE;
		int secondSmall=Integer.MAX_VALUE;
		int thirdSmall=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<firstSmall)
			{
				thirdSmall=secondSmall;
				secondSmall=firstSmall;
				firstSmall=a[i];
			}
			else if(a[i]<secondSmall && firstSmall!=a[i])
			{
				thirdSmall=secondSmall;
				secondSmall=a[i];
			}
			else if(a[i]<thirdSmall && secondSmall!=a[i] && firstSmall!=a[i])
			{
				thirdSmall=a[i];
			}
		}
		System.out.println("Third Smallest element: "+thirdSmall);

	}

}
