package Exam;

import java.util.Scanner;

public class Forrest6 {
	public void instr() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("You see a bright light comming from the south... could it be it?");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                         Where would you like to go next?                  ");
	
		
		Scanner reader = new Scanner(System.in);
		String uinput = reader.nextLine();
		
		int a=0;
		while(a!=1) {
			if (uinput.equals("compas")) {
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("Compas smells the tressure 1m to the north");
				System.out.println("--------------------------------------------------------------------------");
			}
			else if (uinput.equals("north")) {
				Pub ref = new Pub();
				ref.instr();
			}
			else if (uinput.equals("south")) {
				System.out.println("Did I say south? sorry there is just another invisible wall...");
				System.out.println("I ment to say north...");
			}
			else if (uinput.equals("east")) {
				System.out.println("Just a dirty lake... you don't wanna go there...");
			}
			else if (uinput.equals("west")) {
				Forrest5 ref = new Forrest5();
				ref.instr();
			}
			else {
				System.out.println("Invalid input, Type 'north', 'south', 'east', 'west' or 'compas' to navigate around.");
			}
			uinput = reader.nextLine();
		}
			
		
		reader.close();
	}
}
