package Exam;

import java.util.Scanner;

public class M60 {
	public void instr() {
		int a=0;
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("You get onto the M60 at 5pm... every radio station is telling");
		System.out.println("you about the delays on this 'motorway'... you see an exit, do you take it?");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("enter 'yes' or 'no'");
		
		Scanner reader = new Scanner(System.in);
		String uinput = reader.nextLine();
		
		while(a!=2) {
			if (uinput.equals("no")) {
				System.out.println("Hoping for a nice way out you continue on M60... 50mp...40...30");
				System.out.println("eventually traffic stops... and doesn't move an inch.");
				System.out.println("--------------------------------------------------------------------------");
				System.err.println("                GAMEOVER: YOU DIE OF STARVATION                           ");
				System.exit(0);
			}
			else if (uinput.equals("yes")) {
				System.out.println("You take the exit and stick around M60");
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
				System.out.println("Compas smells the tressure 2.83m to the south-east");
				System.out.println("--------------------------------------------------------------------------");
			}
			else if (uinput.equals("north")) {
				System.out.println("INVISIBLE WALL?!?!");
			}
			else if (uinput.equals("south")) {
				Forrest ref = new Forrest();
				ref.instr();
			}
			else if (uinput.equals("east")) {
				Swamp ref = new Swamp();
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
