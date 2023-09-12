package Program;

/* A company has launched a new text editor that allows user to enter English letters, numbers and whitespaces only. If a user
 * attempts to enter any other type of character it is counted as a miss.
 * Given a string of text, write an algorithm to help the developer to detect the number of misses by a given user in the given input.
 * 
 * Input - aa abc@ sad$ hsagd^  
 * Output - 3                       */


public class String_Text_Editor {

	public static void main(String[] args) {
		String str="aa abc@& sad1$ hsagd^";
		char[]a=str.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(!(a[i]>='a' && a[i]<='z')&& !(a[i]>='A' && a[i]<='Z') && !(a[i]>='0' && a[i]<='9') && !(a[i]==' '))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
