// Demonstrate the basic arithmetic operators.

class AddSubMultDiv {
	public static void main(String[] args) {

		// arithmetic using integers

		System.out.println("\n Integer Arithmetic");
		
		int a = 1 + 1;
		int b = a * 3;
		int c = b / 4;
		int d = c - a;
		int e = b % 4;
		
		System.out.println("\n a = " + a);
		System.out.println("\n b = " + b);
		System.out.println("\n c = " + c);
		System.out.println("\n d = " + d);
		System.out.println("\n e = " + e);

		// arithmetic using doubles
		
		System.out.println("\n Floating Point Arithmetic");
		
		double da = 1 + 1;
		double db = da * 3;
		double dc = db / 4;
		double dd = dc - da;
		double de = -dd;
		
		System.out.println("\n da = " + da);
		System.out.println("\n db = " + db);
		System.out.println("\n dc = " + dc);
		System.out.println("\n dd = " + dd);
		System.out.println("\n de = " + de);
	}
}