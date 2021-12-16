package fr.dawan.condition;

import java.util.Scanner;

public class BlocIfElse {

	public static void main(String[] args) {
		Scanner clavier = new Scanner (System.in);
		
		int nbre = 0 ;
		
		System.out.println("Veuillez rentrer un nombre : ");
		
		nbre = clavier.nextInt();
		
		
		if (nbre  > 0) {
			System.out.println("Le nomre est positif");
		} else if(nbre = 0) {
			System.out.println("Le nombre est nul. ");
		}
		  else {
			System.out.println("Le nombre est négatif");
		}
		
	}

}
