package fr.dawan.exercices;

import java.util.Scanner;

public class Exercice16 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int number = 0;
		int sum = 0;
		System.out.println("Veuillez rentrer un nombre : ");
		number = clavier.nextInt();
		
		while (number > 0) {
			sum = sum + number % 10;
			System.out.println(sum);
			number = number / 10;
		}
		System.out.println("La somme de des chiffres de est ?gal ? " + sum);
		
		
		
	}

}
