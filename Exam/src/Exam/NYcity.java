package Exam;

import java.util.Scanner;

public class NYcity {
	public void instr() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("NY CITY BABY! You can see a lake south of your possition which makes sense,");
		System.out.println("where else would they dumb their toxic waste? duhhh? but... is that a swamp? towards west?");
		System.out.println(" is that a swamp? towards west?");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                         Where would you like to go next?                  ");
	
		Scanner reader = new Scanner(System.in);
		String uinput = reader.nextLine();
		
		int a=0;
		while(a!=1) {
			if (uinput.equals("compas")) {
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("Compas smells the tressure 2m towards the south");
				System.out.println("--------------------------------------------------------------------------");
			}
			else if (uinput.equals("north")) {
				System.out.println("INVISIBLE WALL?!?!");
			}
			else if (uinput.equals("south")) {
				Lake ref = new Lake();
				ref.instr();
			}
			else if (uinput.equals("east")) {
				System.out.println("INVISIBLE WALL?!?!");
			}
			else if (uinput.equals("west")) {
				Swamp ref = new Swamp();
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
