package Program;

/* WAP to display the length of the string first and sum of the number at last after the string. 
 * 
 * Input - 1BAN2GA3LO4RE  
 * Output - 9BANGALORE10   */


public class String_Count_Sum {

	public static void main(String[] args) {
		String str="1BAN2GA3LO4RE";
		String result="";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c>='A' && c<='Z')
			{
				result=result+c;
			}
			else if(c>='0' && c<='9')
			{
				sum=sum+(c-'0');
			}
		}
		System.out.println(result.length()+result+sum);

	}

}
