package Program;


// WAP to print the number from 10 to 1 in reverse .

public class Number_in_reverse {

	public static void main(String[] args) {
		System.out.println("===== Using for loop =====");
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("===== Using while loop =====");
		int i=10;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
		
		System.out.println("===== Using do-while loop =====");
		int j=10;
		do
		{
			System.out.println(j);
			j--;
		}
		while(j>=1);
	}

}
