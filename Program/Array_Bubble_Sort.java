package Program;

// WAP to sort the array using bubble sort.

public class Array_Bubble_Sort {

	public static void main(String[] args) {
		int a[]= {5,3,2,4,1};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		// to pint the array
		for(int i:a)
		{
			System.out.print(i+" ");
		}

	}

}
