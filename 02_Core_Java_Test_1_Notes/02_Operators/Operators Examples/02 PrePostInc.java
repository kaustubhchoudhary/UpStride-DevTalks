// Demonstrate ++.

class PrePostInc {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c;
		int d;

		c = ++b;
		d = a++;
		c++;

		System.out.println("\n a = " + a);
		System.out.println("\n b = " + b);
		System.out.println("\n c = " + c);
		System.out.println("\n d = " + d);
	}
}