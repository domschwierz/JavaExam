package Exam;

import java.util.Scanner;

public class Lake2 {
	public void instr() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Strong current pulls you further and further down the lake...");
		System.out.println("two options... fight the current or got with it!");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                         Enter 'fight' or 'go'        			          ");
	
		Scanner reader = new Scanner(System.in);
		String uinput = reader.nextLine();
		
		int a=0;
		while(a!=1) {
			if (uinput.equals("compas")) {
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("You try to pull out the compass but water lake current doesn't let you");
				System.out.println("--------------------------------------------------------------------------");
			}
			else if (uinput.equals("go")) {
				System.out.println("You decide that swimming against the lake current would be too dangerous");
				System.out.println("so you just let it take you.");
				System.out.println("You swim past a building to the west");
				System.out.println("Lake ends in some sort of Forrest, you find a safe place to leave");
				Forrest6 ref = new Forrest6();
				ref.instr();
			}
			else if (uinput.equals("fight")) {
				System.out.println("You try to swim against the lake current and die in an attempt");
				System.out.println("--------------------------------------------------------------------------");
				System.err.println("                GAMEOVER: YOU DROWNED                        ");
				System.exit(0);
			}
			else {
				System.out.println("Invalid input, Type 'north', 'south', 'east', 'west' or 'compas' to navigate around.");
			}
			uinput = reader.nextLine();
		}
			
		
		reader.close();
	}
}
