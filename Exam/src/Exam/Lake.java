package Exam;

import java.util.Scanner;

public class Lake {
	public void instr() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Lake... I wanna say 'it's nice and blue' but NY City is just up north");
		System.out.println("so as much as I would love to say it... I cant");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                         Where would you like to go next?                  ");
		System.out.println("                 You can also enter 'YOLO' to jump in the lake");
	
		Scanner reader = new Scanner(System.in);
		String uinput = reader.nextLine();
		
		int a=0;
		while(a!=1) {
			if (uinput.equals("compas")) {
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("Compas smells the tressure 1m towards the south");
				System.out.println("--------------------------------------------------------------------------");
			}
			else if (uinput.equals("north")) {
				NYcity ref = new NYcity();
				ref.instr();
			}
			else if (uinput.equals("YOLO")) {
				Lake2 ref = new Lake2();
				ref.instr();
			}
			else if (uinput.equals("south")) {
				System.out.println("INVISIBLE WALL?!?!");
			}
			else if (uinput.equals("east")) {
				System.out.println("The only way to go east is to jump in the lake");
			}
			else if (uinput.equals("west")) {
				TheStartingPoint ref = new TheStartingPoint();
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
