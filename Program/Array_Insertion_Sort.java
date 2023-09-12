package Program;

// WAP to sort the array using insertion sort.

public class Array_Insertion_Sort {

	public static void main(String[] args) {
		int a[]= {3,2,5,4,1};
		for(int i=1;i<a.length;i++)
		{
			int j=i;
			int temp=a[i];
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		// to print the array
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		

	}

}
