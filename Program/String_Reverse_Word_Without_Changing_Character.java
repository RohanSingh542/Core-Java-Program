package Program;

/* WAP to reverse the word without reversing the character of the string.*/

public class String_Reverse_Word_Without_Changing_Character {

	public static void main(String[] args) {
		String str="Icecream is my favourite";
		String s[]=str.split(" ");
		for(int i=s.length-1;i>=0;i--)
		{
			String rev="";
			rev=rev+s[i];
			System.out.print(rev+" ");
		}

	}

}
