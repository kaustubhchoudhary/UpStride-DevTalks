// Demonstrate ?: 

class Ternary {

	public static void main(String[] args) {
		
		int age = 22;
		String result = "";
		
//      Single if-else statement

/*		if(age >= 18){
			result = "Eligible to vote";
		} else {
			result = "Not eligible to vote";
		}
*/
		// Ternary operator -> ? :
		result = (age >= 18 ? "Eligible to vote" : "Not eligible to vote");

		System.out.println(result);
	}
}