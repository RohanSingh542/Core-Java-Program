package Program;

// WAP to find the perfect number in a range of 1 to 100.
public class Perfect_Number_In_a_Range {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(i==sum)
			{
				System.out.println(i);
			}
		}

	}

}
