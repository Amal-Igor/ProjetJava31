package fr.dawan.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice24 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int[]arr = new int[5];
		int count = 0;
		int i;
		int x = 0;
		
		
		for(i = 0 ; i < 5 ; i++) {
			System.out.println("Veuillez rentrer le nombre " + (i + 1) + " :");
			arr[i] = clavier.nextInt();
		}
		
		
//			System.out.println("Veuillez rentrer un nombre dont vous voulez voir l'occurence : ");
//			x = clavier.nextInt();

			for(i = 0; i < arr.length; i++) {
				if(x == arr[i]) {
					count++;
			}		
			System.out.println("Le nombre " + arr[i] + " apparait " + count +" fois");
			}
		
		
		
		System.out.println(count);
			
		//Trouver les occurences
//		System.out.println("Le nombre " + x + " apparait " + count + " fois ! ");
		
		 
	}

}
