package Program;

import java.util.Arrays;

// WAP to find the elements using binary search.

public class Array_Binary_Search {

	public static void main(String[] args) {
		int a[]= {11,33,44,55,88,66};
		Arrays.sort(a);
		int search=55;
		int sp=0;
		int ep=a.length-1;
		int mp=(sp+ep)/2;
		while(sp<=ep)
		{
			if(a[mp]==search)
			{
				System.out.println("The search is present at: "+mp);
				break;
			}
			else if(search>a[mp])
			{
				sp=mp+1;
			}
			else if(search<a[mp])
			{
				ep=mp-1;
			}
			mp=(sp+ep)/2;
		}
		if(sp>ep)
		{
			System.out.println("The search is not present");
		}

	}

}
