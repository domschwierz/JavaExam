package Exam;

import java.util.Scanner;
public class Forrest2 {
	public void instr() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Forrest seems to be getting darker and darker as you continue");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                         Where would you like to go next?                  ");
	
		
		Scanner reader = new Scanner(System.in);
		String uinput = reader.nextLine();
		
		int a=0;
		while(a!=1) {
			if (uinput.equals("compas")) {
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("Compas smells the tressure 3m to the east");
				System.out.println("--------------------------------------------------------------------------");
			}
			else if (uinput.equals("north")) {
				Forrest1 ref = new Forrest1();
				ref.instr();
			}
			else if (uinput.equals("south")) {
				Forrest3 ref = new Forrest3();
				ref.instr();
			}
			else if (uinput.equals("east")) {
				System.out.println("INVISIBLE WALL?!?!");
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
