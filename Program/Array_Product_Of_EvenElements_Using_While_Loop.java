package Program;

// WAP to find product of even element of an array using while loop.
public class Array_Product_Of_EvenElements_Using_While_Loop {

	public static void main(String[] args) {
		int a[]= {4,3,5,2,7,6};
		int pro=1;
		int i=0;
		while(i<a.length)
		{
			if(a[i]%2==0)
			{
				pro=pro*a[i];
			}
			i++;
		}
		System.out.println("The product of even elements is "+pro);

	}

}
