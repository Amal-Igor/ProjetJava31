package fr.dawan.boucles;

import java.util.Scanner;

public class BoucleWhile {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int[] age = 0;
		
		while (age <= 10) {
			System.out.println("Entrez votre age : ");
			age = clavier.nextInt();
		}]
		System.out.println("Vous avez  "+ age + " ans.");
	}

}
