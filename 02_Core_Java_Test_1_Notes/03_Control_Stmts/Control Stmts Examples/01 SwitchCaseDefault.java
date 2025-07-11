// Simple switch-case-default statement

import java.util.Scanner;

class SwitchCaseDefault {

	public static void main(String [] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.print("\n Enter option : ");
		
		int option = s.nextInt();

		switch (option) {			
			case 1:
				System.out.println("\n Case 1");
				break;
			case 2:
				System.out.println("\n Case 2");
				break;
			case 3:
				System.out.println("\n Case 3");
				break;
			default:
				System.out.println("\n Default");			
		}
		
		System.out.println("\n Outside Switch");		
	}
}