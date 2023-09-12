package Program;

/* WAP to convert the uppercase character to lowercase character and lowercase character to uppercase character.  */


public class String_Uppercase_Lowercase_Character {

	public static void main(String[] args) {
		String str="WeLComE";
		String result="";
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c>='A' && c<='Z')
			{
				result=result+((char)(c+32));
			}
			else if(c>='a' && c<='z')
			{
				result=result+((char)(c-32));
			}
		}
		System.out.println("Original String: "+str);
		System.out.println("Result: "+result);

	}

}
