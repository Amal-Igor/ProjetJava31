package fr.dawan.condition;

import java.util.Scanner;

public class OperateursLogiques {

	public static void main(String[] args) {
		/*
		 * Les op�rateurs logiques s'appliquent sur des op�randes bool�ens et produisent un r�sultat
		 * qui est forc�meent bool�en
		 * 
		 * Java comporte 3 op�rateurs logiques dont, dont une unaire et deux binaires
		 * 
		 * A&&B est (true) si A = true et B = true
		 * A||B est vrai si un des op�randes est vraie sinon faux
		 * !A ==> A est vraie alors !A est faux
		 * 
		 * Table logique 
		 * A	B			A&&B 		A||B 		!A
		 * v	v			  v		   	 v           f
		 * v	f			  f			 v			 f
		 * f	v			  f			 v			 v
		 * f	f			  f		     f			 v
		 */
		
		
		Scanner clavier = new Scanner(System.in);
		
		int a, b , c;
		int nbre = 0;  //Test op�rateur !
		
		//Fournir 
		System.out.println("Entrez la valeur de a: ");
		a = clavier.nextInt();
		System.out.println("Entrez la valeur de b: ");
		b = clavier.nextInt();
		System.out.println("Entrez la valeur de c: ");
		c = clavier.nextInt();
		
		
		//Test OU
		if (a == b || b == c) {
			System.out.println("Deux valeurs sont au moins identiques. ");
		}
		//Test ET
		if(a == b && b == c) {
			System.out.println("Deux valeurs sont au moisn identiques. ");
		}
		
		//Op�rateur Non(!)
		System.out.println("\n Test de l'op�rateur NON \ "!"");
		System.out.println("");
		nbre = clavier.nextInt();
		
		if(nbre > 0) {
			
		}
		
	}

}
