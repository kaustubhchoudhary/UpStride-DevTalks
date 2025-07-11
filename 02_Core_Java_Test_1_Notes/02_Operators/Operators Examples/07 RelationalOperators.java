// Understanding Relational operators.

class RelationalOperators {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		
		boolean answer = x < y;
		
		System.out.println("\n answer : " + answer);

		System.out.println("\n (x < y) : " + (x < y));
		
		x = x * 2;
		System.out.println("\n (x == y) : " + (x == y));

		x = x + 2;
		System.out.println("\n (x > y) : " + (x > y));

		System.out.println("\n (x >= 22) : " + (x >= 22));

		System.out.println("\n (x <= 22) : " + (x <= 22));

		System.out.println("\n (x != 22) : " + (x != 22));

		if(x!=22) {
			System.out.println("\n Inside if");
		} else {
			System.out.println("\n Inside else");
		}
	}
}








