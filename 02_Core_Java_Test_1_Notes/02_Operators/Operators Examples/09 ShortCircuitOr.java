
// If the left is true.. flow will not go to right of ||
// If the left is false.. flow will go to right of ||

class ShortCircuitOr {

	public static void main(String[] args) {

		int c = 1, d = 100, e = 50;
		
		if( c == 0 || ++e < 50 ) {
		
			d = 150;
		}
		
		System.out.println("\n d = " + d );//100
		System.out.println("\n e = " + e );//51
	}
}