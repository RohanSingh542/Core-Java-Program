package Program;

/* WAP to convert lowercase string to uppercase and uppercase to lowercase of the string.    */

public class String_Lowercase_Uppercase {

	public static void main(String[] args) {
		String str1="WELCOME"; //uppercase string
		String str2="rohan"; //lowercase string
		String lower="";
		String upper="";
		for(int i=0;i<str1.length();i++)
		{
			char c=str1.charAt(i);
			if(c>='A' && c<='Z' )
			{
				lower=lower+((char)(c+32));
			}
		}
		System.out.println("Uppercase String: "+str1);
		System.out.println("Lowercase String: "+lower);
		for(int i=0;i<str2.length();i++)
		{
			char c=str2.charAt(i);
			if(c>='a' && c<='z')
			{
				upper=upper+((char)(c-32));
			}
		}
		System.out.println();
		System.out.println("Lowercase String: "+str2);
		System.out.println("Uppercase String: "+upper);
		

	}

}
