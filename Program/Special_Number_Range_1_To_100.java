package Program;

// WAP to print all special number in the range of 1 to 100.

public class Special_Number_Range_1_To_100 {

	public static void main(String[] args) {
		for(int n=1;n<=100;n++)
		{
			int temp=n;
			int sum=0,pro=1;
			while(temp!=0)
			{
				int d=temp%10;
				sum=sum+d;
				pro=pro*d;
				temp=temp/10;
			}
			if(n==(sum+pro))
				System.out.println(n);
		}

	}

}
