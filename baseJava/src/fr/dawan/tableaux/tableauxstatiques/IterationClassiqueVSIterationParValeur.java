package fr.dawan.tableaux.tableauxstatiques;

import java.util.Arrays;
import java.util.Scanner;

public class IterationClassiqueVSIterationParValeur {

	static Scanner clavier = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 * 
		 * Nous allons voir les avantages et inconv?nients entre l'it?ration classique et it?ration par valeur
		 * 
		 * Conclusion: Pour modifier une valeur on va utiliser l'it?ration classique
		 * 
		 * 
		 * 2eme cas: On ne peut pas tester des valeurs dans les tableaux avec la boucle foreach
		 * Par contre avec la boucle for classique c'est possible. On peut ?crire tab[i] == tab[i+1]
		 * 
		 * 
		 *POUR LIRE LES ELEMENT FOR EACH /// POUR MODIFIER FOR
		 */
		
		int[] tab = {100, 200, 300, 10};
		System.out.println("It?ration classique");
		
		for(int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
			//tab[i] = 22;
		}
		
		for(int element : tab) // pour chaque <element> du tableau
			{
			System.out.println(element);
		} 
		
		
		
	}

}
