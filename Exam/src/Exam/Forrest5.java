package Exam;

import java.util.Scanner;

public class Forrest5 {
		public void instr() {
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("Forrest is getting a lot brighter, you hear more birds singing and all other");
			System.out.println("positive-sounding stuff that you would hear in books and films to let the ");
			System.out.println("audience know something nice is about to happen");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("                         Where would you like to go next?                  ");
		
			
			Scanner reader = new Scanner(System.in);
			String uinput = reader.nextLine();
			
			int a=0;
			while(a!=1) {
				if (uinput.equals("compas")) {
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("Compas smells the tressure 1.41m to the north-east");
					System.out.println("--------------------------------------------------------------------------");
				}
				else if (uinput.equals("north")) {
					System.out.println("INVISIBLE WALL?!?!");
				}
				else if (uinput.equals("south")) {
					System.out.println("INVISIBLE WALL?!?!");
				}
				else if (uinput.equals("east")) {
					Forrest6 ref = new Forrest6();
					ref.instr();
				}
				else if (uinput.equals("west")) {
					Forrest4 ref = new Forrest4();
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
