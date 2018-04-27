package Exam;

import java.util.Scanner;

public class Mountains {
	public void instr() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("You climb the mountain and get a nice view of the place.");
		System.out.println("Massive forrest starting north-west from your possition all");
		System.out.println("the way across the east... also two buildings near by?");
		System.out.println("One towards west and the other one towards east");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                         Where would you like to go next?                  ");
	
		Scanner reader = new Scanner(System.in);
		String uinput = reader.nextLine();
		
		int a=0;
		while(a!=1) {
			if (uinput.equals("compas")) {
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("Compas smells the tressure 1m to the east");
				System.out.println("--------------------------------------------------------------------------");
			}
			else if (uinput.equals("north")) {
				TheStartingPoint ref = new TheStartingPoint();
				ref.instr();
			}
			else if (uinput.equals("south")) {
				System.out.println("INVISIBLE WALL?!?!");
			}
			else if (uinput.equals("east")) {
				Pub ref = new Pub();
				ref.instr();
			}
			else if (uinput.equals("west")) {
				Tesco ref = new Tesco();
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
