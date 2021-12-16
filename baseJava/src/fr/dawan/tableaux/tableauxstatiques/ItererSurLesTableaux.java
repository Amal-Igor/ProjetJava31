package fr.dawan.tableaux.tableauxstatiques;

import java.util.Arrays;
import java.util.Scanner;

public class ItererSurLesTableaux {
	
static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		int[] tab = {200, 330, 50};
		double[] tab2 = {25.8, 6.54, 100.01, 91.1};
				
				
				
		int age[] = new int[10];
		for(int i = 1; i < 10; i++) {
			System.out.println("Entrez l'age de l'utilisateur " + i + ": ");
			age[i] = clavier.nextInt();
		}
		System.out.println(Arrays.toString(age));
		
		
		//Methode forEach
		//Iteration sur ensemble de valeur
		//pour chaque élément présent au niveau de mon tableau j'affiche cet élément
		
		System.out.println("Boucle forEach");
		
		for(double element : tab2) {
			System.out.println(element);
		}
		
	}

}
