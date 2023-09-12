package Program;

/* WAP to sort the array using selection sort.  */

public class Array_Selection_Sort {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,1};
		for(int i=0;i<a.length;i++)
		{
			int min=i; //to store the smallest element of an array
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		// to print the array
		for(int i:a)
		{
			System.out.print(i+" ");
		}

	}

}
