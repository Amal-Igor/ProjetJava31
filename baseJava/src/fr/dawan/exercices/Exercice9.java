package fr.dawan.exercices;

import java.util.Scanner;

public class Exercice9 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		int year = 0;
		
		System.out.println("Veuillez entrer une ann?e pour v?rifier si elle est bissextile : ");

		year = clavier.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
		System.out.println("L'ann?e est bissextile ");	
		} else { System.out.println("L'ann?e n'est pas bissextile !");}
	}

}
