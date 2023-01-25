package org.lessons.java.security;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		String Name= "Giuseppe";
		String Surname= "Garibaldi";
		String Color= "Red";
		byte Day= 5;
		byte Month= 5;
		short Year= 1990;
		
		
		System.out.println("Password: " +Name +"-" +Surname +"-" +Color +"-" +(Day +Month +Year));
	}
}
