package fr.dawan.exercices;

import java.util.Scanner;

public class Exercice13 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		int a;
		
		System.out.println("Veuillez rentrer un chiffre : ");
		a = clavier.nextInt();
		for (int i = 0; i <= a; i++) {
			while (i%2 != 0) {
				System.out.println(i++);
			}
			
		}
		}
		
		
	}


