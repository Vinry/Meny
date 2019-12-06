package Labb6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Menu testMenu = new Menu("En liten testmeny");
		testMenu.add(new AbstractMenuItem("Tillbaka") { //anonym
		
		public void execute() { // Gör ingenting.
		}
		});
		testMenu.add(new AbstractMenuItem("Skriv ut hej") { //anonym
		
		public void execute() {
		System.out.println("Hej!!!");
		}
		});
		testMenu.add(testMenu); // Wow, en cirkulär meny!
		// TODO Auto-generated method stub
		/*int result = 0;
		while (!(result == 2)) {
			result = showMenu();
			switch (result) {
			case 1:

				break;

			case 2:

				break;

			case 3:

				break;

			default:

			}
		}*/
	}

}
