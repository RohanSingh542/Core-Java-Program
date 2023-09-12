package Program;

/* WAP to print if the number is divisible by 3, 5, 3 & 5. if it is divisible by 3 the print "Hi".
if it is divisible by 5 then print "Hello" and if it is divisible by 3 & 5 both then print "How are you" in the range 1 to 10. */

public class Divisible_by_number {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i%3==0)
			{
				System.out.println("Hi");
			}
			else if(i%5==0)
			{
				System.out.println("Hello");
			}
			else if(i%3==0 && i%5==0)
			{
				System.out.println("How are you");
			}
			else
			{
				System.out.println(i);
			}
		}

	}

}
