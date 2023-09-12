package Program;

// WAP to swap a 2 number using third variable.

public class Swap_Number_With_Using_Third_Variable {

	public static void main(String[] args) {
		int a=10;
		int b=12;
		System.out.println("===== Before Swapping =====");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("===== After Swapping =====");
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a: "+a);
		System.out.println("b: "+b);

	}

}
