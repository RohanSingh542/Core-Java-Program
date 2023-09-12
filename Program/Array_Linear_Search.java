package Program;

// WAP to search the element specified by user using linear(sequentially) search.

public class Array_Linear_Search {

	public static void main(String[] args) {
		int a[]= {22,13,15,14,13,18,92,45};
		int search=13;
		boolean flag=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.println("The search element present at: "+i);
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("The search is not present");
		}


	}

}
