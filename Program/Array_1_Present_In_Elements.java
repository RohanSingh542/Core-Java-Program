package Program;

// WAP to count how many 1 present in all the elements of an array. 

public class Array_1_Present_In_Elements {

	public static void main(String[] args) {
		int a[]= {5,15,311,21,114,61};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			while(a[i]!=0)
			{
				int d=a[i]%10;
				if(d==1)
				{
					count++;
				}
				a[i]=a[i]/10;
			}
		}
		System.out.println("Total 1 present: "+count);

	}

}
