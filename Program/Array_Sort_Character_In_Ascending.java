package Program;

// WAP to sort the character in ascending order  using insertion sort.

public class Array_Sort_Character_In_Ascending {

	public static void main(String[] args) {
		char a[]= {'G','A','U','R','A','V'};
		for(int i=1;i<a.length;i++)
		{
			int j=i;
			char temp=a[i];
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}

	}

}
