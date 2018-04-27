package Exam;

import java.util.Scanner;

public class Swamp {
	public void instr() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Looks like a swamp... smells like a swamp... feels like a swamp...");
		System.out.println("Some green looking dude tells you to get of his land");
		System.out.println("but nothing else too interesting about this place...");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                         Where would you like to go next?                  ");
	
		Scanner reader = new Scanner(System.in);
		String uinput = reader.nextLine();
		
		int a=0;
		while(a!=1) {
			if (uinput.equals("compas")) {
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("Compas smells the tressure 1.73m to the south-east");
				System.out.println("--------------------------------------------------------------------------");
			}
			else if (uinput.equals("north")) {
				System.out.println("INVISIBLE WALL?!?!");
			}
			else if (uinput.equals("south")) {
				TheStartingPoint ref = new TheStartingPoint();
				ref.instr();
			}
			else if (uinput.equals("east")) {
				NYcity ref = new NYcity();
				ref.instr();
			}
			else if (uinput.equals("west")) {
				M60 ref = new M60();
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
