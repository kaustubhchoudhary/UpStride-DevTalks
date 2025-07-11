// Demonstrate ++ and --.

class IncDec {
	
	public static void main(String[] args) {
		
		int a, b;

		// Understanding pre-increment operator
		a = 10;
		b = ++a;
		System.out.print("\n a = " + a); 
		System.out.println(", b = " + b);

		// Understanding post-increment operator
		a = 10;
		b = a++;
		System.out.print("\n a = " + a); 
		System.out.println(", b = " + b);

		// Understanding pre-decrement operator
		a = 10;
		b = --a;
		System.out.print("\n a = " + a); 
		System.out.println(", b = " + b);

		// Understanding post-decrement operator
		a = 10;
		b = a--;
		System.out.print("\n a = " + a); 
		System.out.println(", b = " + b);

	}
} 