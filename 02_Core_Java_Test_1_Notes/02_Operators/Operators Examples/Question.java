
class Question {

	public static void main(String[] args) {    

		boolean a = true;
		boolean b = !true;
		boolean c = a | b;
		boolean d = a & b;
		boolean e = d ? b : c;

		System.out.println("\n a = " + a);
		System.out.println("\n b = " + b);
		System.out.println("\n c = " + c);
		System.out.println("\n d = " + d);
		System.out.println("\n e = " + e);
	} 
}