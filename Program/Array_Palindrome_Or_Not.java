package Program;

// WAP to check if the array is palindrome or not.

public class Array_Palindrome_Or_Not {

	public static void main(String[] args) {
		int a[]= {1,2,4,2,1};
		int b[]=new int[a.length];
		for(int i=0,j=a.length-1;i<a.length;i++,j--)
		{
			b[i]=a[j];
		}
		
		boolean flag=true;
		for(int i=0,j=0;i<a.length;i++,j++)
		{
			if(a[i]!=b[j])
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}
