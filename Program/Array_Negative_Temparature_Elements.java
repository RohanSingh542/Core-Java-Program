package Program;

/*  A cold storage company has N storage units for various products. The company has received N orders that must be preserved
 *  at respective N temparatures inside the storage units. The company manager wishes to identify which products must be preserved
 *  at negative temparature.
 *   Write an algorithm to help the manager find the number of products that have negative temparature storage requirements.  */


public class Array_Negative_Temparature_Elements {

	public static void main(String[] args) {
		int a[]= {9,-3,8,-6,-7,8,10};
		int count=0;
		int min=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
