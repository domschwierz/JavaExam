package Exam;

import java.util.Scanner;

public class TheStartingPoint {

	public void instr() {
		System.out.println("--------------------------------------------------------------------------");	
		System.out.println("You look around and find yourself at this place called 'The Starting Point'.");
		System.out.println("Nothing too interesting, very central... very nice... well its time to move.");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                         Where would you like to go next?                  ");
		
		Scanner reader = new Scanner(System.in);
		String uinput = reader.nextLine();
		
		int a=0;
		while(a!=1) {
			if (uinput.equals("compas")) {
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("Compas smells the tressure 1.41m to the south-east");
				System.out.println("--------------------------------------------------------------------------");
			}
			else if (uinput.equals("north")) {
				Swamp ref = new Swamp();
				ref.instr();
			}
			else if (uinput.equals("south")) {
				Mountains ref = new Mountains();
				ref.instr();
			}
			else if (uinput.equals("east")) {
				Lake ref = new Lake();
				ref.instr();
			}
			else if (uinput.equals("west")) {
				Forrest ref = new Forrest();
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
