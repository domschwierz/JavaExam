package Exam;

import java.util.Scanner;

public class Forrest1 {
	public void instr() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("You step further into the forrest, it seems to be almost linear...");
		System.out.println("invisible walls all over the place making sure you go one direction");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                         Where would you like to go next?                  ");
	
		
		Scanner reader = new Scanner(System.in);
		String uinput = reader.nextLine();
		
		int a=0;
		while(a!=1) {
			if (uinput.equals("compas")) {
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("Compas smells the tressure 3.16m to the south-east");
				System.out.println("--------------------------------------------------------------------------");
			}
			else if (uinput.equals("north")) {
				System.out.println("INVISIBLE WALL?!?!");
			}
			else if (uinput.equals("south")) {
				Forrest2 ref = new Forrest2();
				ref.instr();
			}
			else if (uinput.equals("east")) {
				Forrest ref = new Forrest();
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
