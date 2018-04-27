package Exam;

import java.util.Scanner;

public class Forrest4 {
	public void instr() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Forrest gets a bit brighter, as if you was getting close to something");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                         Where would you like to go next?                  ");
	
		
		Scanner reader = new Scanner(System.in);
		String uinput = reader.nextLine();
		
		int a=0;
		while(a!=1) {
			if (uinput.equals("compas")) {
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("Compas smells the tressure 1.73m to the north-east");
				System.out.println("--------------------------------------------------------------------------");
			}
			else if (uinput.equals("north")) {
				System.out.println("INVISIBLE WALL?!?!");
			}
			else if (uinput.equals("south")) {
				System.out.println("INVISIBLE WALL?!?!");
			}
			else if (uinput.equals("east")) {
				Forrest5 ref = new Forrest5();
				ref.instr();
			}
			else if (uinput.equals("west")) {
				Forrest3 ref = new Forrest3();
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
