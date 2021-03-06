package fr.dawan.tableaux.tableauxdynamiques;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

	public static void main(String[] args) {
/*
 * L'objectif des tableaux dynamiques, dite collection, est de pouvoir cr?er des tableaux qu'on pourra facilement modifier
 * la taille peut augmenter au fur et ? mesure 
 * 
 * Nous allons utiliser la classe ArrayList pour cr?er un tableau dynamique:
 * C'est un objet qui n'a pas de taille limite comme les tableaux fixes 
 * 
 * La classe ArrayList est utilis?e pour les types ?volu?s, complexes non les types primitifs
 * 
 * On peut lui affecter entre chevron le type de donn?e qu'il va stocker
 * 
 * 
 */
		//tableau chaine de caract?re
		ArrayList<String> tab1 = new ArrayList<String>();
		
		//Connaitre la taille du tableau
		
		
		//Tableau d'entier
		ArrayList<Integer> tab2 = new ArrayList<Integer>();	
		tab2.add(20); //permet d'ajouter des donn?es au tableau
		
		System.out.println(tab2.get(0));//20
		tab2.set(0,60);					//Remplace 20 => 60
		System.out.println(tab2.get(0));//60
		
		tab2.add(350);
		tab2.add(100);
		tab2.add(150);
		
		if(tab2.contains(50)) {
			System.out.println("L'?l?ment 50 est dans le tableau");
		} else {System.out.println("L'?l?ment n'est pas dans le tableau");}
	}
	
	//....///

}
