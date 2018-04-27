package Exam;

import java.util.Scanner;

public class Forrest {
	public void instr() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("You enter a large forrest, it seems to be wide and full of ");
		System.out.println("... invisible walls?");
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
				M60 ref = new M60();
				ref.instr();
			}
			else if (uinput.equals("south")) {
				Tesco ref = new Tesco();
				ref.instr();
			}
			else if (uinput.equals("east")) {
				TheStartingPoint ref = new TheStartingPoint();
				ref.instr();
			}
			else if (uinput.equals("west")) {
				Forrest1 ref = new Forrest1();
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
