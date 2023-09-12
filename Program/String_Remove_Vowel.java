package Program;

// WAP to remove the vowel from the given string.

public class String_Remove_Vowel {

	public static void main(String[] args) {
		String str="Rohan";
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u')
			{
				result=result+c;
			}
		}
		System.out.println(result);

	}

}
