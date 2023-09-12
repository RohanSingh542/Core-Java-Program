package Program;

// WAP to find the average of the element in the array. 

public class Array_Element_Average {

	public static void main(String[] args) {
		int a[]= {5,6,7,4,8,3};
		
		float sum=0.0f;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		float avg=sum/a.length;
		System.out.println("Average of elements: "+avg);

	}

}
