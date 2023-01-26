package org.lessons.java.Ferragnez;

import java.util.Scanner;

public class CheckGuest_Bonus {

	public static void main(String[] args) {

		String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeili" };

		Scanner s = new Scanner(System.in);

		System.out.println("Insert your name: ");

		String username = s.nextLine();

		s.close();

		int i = 0;

		while (i < guests.length) {

			if (username.toLowerCase().equals(guests[i].toLowerCase())) {
				System.out.println("Welcome: " + username);
				break;
				
			} else {
				System.out.println("You are not in the list!");
				break;
			}
		}
	}
}
