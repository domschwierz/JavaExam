package Exam;

import java.util.Scanner;


public class Start {
	
	
	public static void main (String[] args) {
		
		System.out.println("--------------------------------------------------------------------------");	
		System.out.println("Greetings player, welcome to the 'Barren Moore'!");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("You found yourself in a middle of a conveniently named place called");
		System.out.println("'The Starting Point', and suddenly relise you are in a game! The only way to leave is to");
		System.out.println("find the Treasure! (don't ask me how you relised, just go along with it)");
		System.out.println("You are currently in the middle of the map");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Type 'north', 'south', 'east'or 'west' to navigate around.");
		System.out.println("Type 'compas' to see directions towards the tressure");
		System.out.println("GOOD LUCK!");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                        Enter 'start' to begin                            ");
		
		Scanner reader = new Scanner(System.in);
		String uinput = reader.nextLine();
		
		int a=0;
		while(a!=1) {
			if (uinput.equals("start")) {
				TheStartingPoint ref = new TheStartingPoint();
				ref.instr();
			}
			else System.out.println("Invalid input, type 'start' to beggin.");
			uinput = reader.nextLine();
		}
		reader.close();
	}
}
