package Program;

// WAP to find the binary number of elements of an array.

public class Array_Binary_Number_Of_Elements {

	public static void main(String[] args) {
		int a[]= {2,12,10,22,15};
		for(int i=0;i<a.length;i++)
		{
			String binary="";
			while(a[i]!=0)
			{
				int rem=a[i]%2;
				binary=rem+binary;
				a[i]=a[i]/2;
			}
			System.out.println("The binary elements: "+binary);
		}

	}

}
