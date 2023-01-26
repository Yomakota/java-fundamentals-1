package org.lessons.java.train;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
				
		float price= 0.21F;
		int discountUnder= 20;
		int discountOver= 40;
		int age;
		int kmUser;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Insert Km: ");
		kmUser = s.nextInt();
		
		System.out.println("Insert age: ");
		age = s.nextInt();
		
		if (age >= 65) {
			System.out.println("ticket price: " + (price * kmUser - (price*kmUser)*discountOver / 100) + " euro");
		}
		else if (age < 18) {
			System.out.println("ticket price: " + (price * kmUser - (price*kmUser)*discountUnder / 100) + " euro");
		}
		else {
			System.out.println("ticket price: " + price * kmUser + " euro");
		}
		
		s.close();
		
	}
}
