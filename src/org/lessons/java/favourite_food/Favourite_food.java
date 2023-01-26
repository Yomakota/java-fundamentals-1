package org.lessons.java.favourite_food;

public class Favourite_food {

	public static void main(String[] args) {

		String[] favouriteFood = { "pasta", "torta", "pesce", "carne", "cioccolato", "frutta", "uova" };

		System.out.println("Lunghezza classifica: " + favouriteFood.length);

		System.out.println("cibo preferito : " + favouriteFood[0]);

		System.out.println("meno preferito : " + favouriteFood[favouriteFood.length - 1]);

		System.out.println("Metà classifica: " + favouriteFood[(favouriteFood.length) / 2]);

	}

}