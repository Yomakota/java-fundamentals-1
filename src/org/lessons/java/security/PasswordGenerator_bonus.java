package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator_bonus {
	
	public static void main(String[] args) {


		String Name;
		String Surname;
		String Color;
		int Day;
		int Month;
		int Year;

		Scanner s= new Scanner(System.in);

		System.out.print("Insert your Name: ");
		Name = s.nextLine();
		
		System.out.print("Insert your Surname: ");
		Surname = s.nextLine();
		
		System.out.print("Insert your favourite color: ");
		Color = s.nextLine();
		
		System.out.print("Day of your date of birth: ");
		Day = s.nextInt();
		
		System.out.print("Month of your date of birth: ");
		Month = s.nextInt();
		
		System.out.print("Year of birth: ");
		Year = s.nextInt();
		
		System.out.println("Password: " +Name +"-" +Surname +"-" +Color +"-" +(Day +Month +Year));
		
	
		s.close();
	}

}
