package Program;

// WAP to swap 2 number without using third variable.

public class Swap_Number_Without_Using_Third_Variable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("===== Before Swapping =====");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("===== After swapping =====");
		System.out.println("a: "+a);
		System.out.println("b: "+b);

	}

}
