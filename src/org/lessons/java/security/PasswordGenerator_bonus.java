package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator_bonus {
	
	public static void main(String[] args) {


		String Name;
		String Surname;
		String Color;
		byte Day;
		byte Month;
		short Year;

		Scanner s= new Scanner(System.in);

		System.out.print("Insert your Name: ");
		Name = s.nextLine();
		
		System.out.print("Insert your Surname: ");
		Surname = s.nextLine();
		
		System.out.print("Insert your favourite color: ");
		Color = s.nextLine();
		
		System.out.print("Day of your date of birth: ");
		Day = s.nextByte();
		
		System.out.print("Month of your date of birth: ");
		Month = s.nextByte();
		
		System.out.print("Year of birth ");
		Year = s.nextShort();
		
		System.out.println("Password: " +Name +"-" +Surname +"-" +Color +"-" +(Day +Month +Year));
		
	
		s.close();
	}

}
