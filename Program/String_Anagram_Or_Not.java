package Program;

import java.util.Arrays;

// WAP to display the string are anagram or not.

public class String_Anagram_Or_Not {

	public static void main(String[] args) {
		String str1="EAT";
		String str2="TEA";
		if(str1.length()!=str2.length())
		{
			System.out.println("Length are not same");
		}
		else
		{
			char c1[]=str1.toCharArray();
			char c2[]=str2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean flag=true;
			for(int i=0;i<c1.length;i++)
			{
				if(c1[i]!=c2[i])
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println("It is a anagram");
			}
			else
			{
				System.out.println("Not an anagram");
			}
		}

	}

}
