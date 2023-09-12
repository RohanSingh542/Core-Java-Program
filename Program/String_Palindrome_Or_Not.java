package Program;

// WAP to check whether the string is palindrome or not.

public class String_Palindrome_Or_Not {

	public static void main(String[] args) {
		String str=" Dad";
		str=str.trim(); // removing white spaces from starting and ending
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		if(str.equalsIgnoreCase(rev))  // Ignoring the case compare only character
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
		}

	}

}
