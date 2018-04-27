package Exam;

import java.util.Scanner;

public class Pub {
	public void instr() {
		int a=0;
		
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("You notice a nice cosy looking building, you think to yourself...");
		System.out.println("WHAT'S THE WORST THAT COULD HAPPEN (famous last words).");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Would you like to enter the building?");
		System.out.println("Enter 'yes' or 'no'");
		
		String uinput = reader.nextLine();
		
		while(a!=2) {
			if (uinput.equals("yes")) {
				System.out.println("You approach the building... Strong light blinding you as you push");
				System.out.println("the heavy doors with all your might... you look ahed and see it...");
				System.out.println("                         THE TRESURE                              ");
				System.out.println("A cold pint of fosters! just what you needed to leave this game!  ");
				System.out.println("--------------------------------------------------------------------------");
				System.err.println("             CONGRATULATIONS! You have completed the game!");
				System.exit(0);
			}
			else if (uinput.equals("no")) {
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
				System.out.println("It's here somewere!");
				System.out.println("--------------------------------------------------------------------------");
			}
			else if (uinput.equals("north")) {
				System.out.println("INVISIBLE WALL?!?!");
			}
			else if (uinput.equals("south")) {
				Forrest6 ref = new Forrest6();
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
