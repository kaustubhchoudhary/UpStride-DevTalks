// Use a string to control a switch statement.

import java.util.Scanner;

class StringSwitch {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n Enter option : ");
		String str = s.nextLine();
		
		switch(str) {
			
			case "one":
				System.out.println("one");
				break;
			case "two": 
				System.out.println("two");
				break;
			case "three":
				System.out.println("three");
				break;
			default: 
				System.out.println("no match");
				break;
		}
		
		System.out.println("\nOutside switch");
	}
}