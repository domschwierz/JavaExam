package Exam;

import java.util.Scanner;

public class Tesco {
	public void instr() {
		int a=0;
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Wait... is this? no way... it can't be...Tesco???");
		System.out.println("You walk in, there is some milk on sale... do you buy it?");
		System.out.println("Enter 'yes' or 'no'?");
		
		Scanner reader = new Scanner(System.in);
		String uinput = reader.nextLine();
		
		while(a!=2) {
			if (uinput.equals("yes")) {
				System.out.println("Milk this cheap?!?! THIS MUST BE THE TREASURE!");
				System.out.println("You drink it and die");
				System.out.println("--------------------------------------------------------------------------");
				System.err.println("                GAMEOVER: YOU DIE OF FOOD POISONING                        ");
				System.exit(0);
			}
			else if (uinput.equals("no")) {
				System.out.println("You decide not to and wonder around for no reason instead of asking for help");
				a=2;
			}
			else {
				System.out.println("Invalid input, Enter 'yes' or 'no'");
				uinput = reader.nextLine();
			}
		}
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                         Where would you like to go next?                  ");
	

		uinput = reader.nextLine();
		
		while(a!=1) {
			if (uinput.equals("compas")) {
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("Compas smells the tressure 2m to the east");
				System.out.println("--------------------------------------------------------------------------");
			}
			else if (uinput.equals("north")) {
				Forrest ref = new Forrest();
				ref.instr();
			}
			else if (uinput.equals("south")) {
				System.out.println("INVISIBLE WALL?!?!");
			}
			else if (uinput.equals("east")) {
				Mountains ref = new Mountains();
				ref.instr();
			}
			else if (uinput.equals("west")) {
				System.out.println("INVISIBLE WALL?!?!");
			}
			else {
				System.out.println("Invalid input, Type 'north', 'south', 'east', 'west' or 'compas' to navigate around.");
			}
			uinput = reader.nextLine();
		}
			
		
		reader.close();
	}

}
