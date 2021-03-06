package fr.dawan.tableaux.tableauxdynamiques;

import java.util.ArrayList;

public class Wrapper {

	public static void main(String[] args) {
		ArrayList<Integer> tab = new ArrayList();
		
		//Parser une chaine de caract?re entier
		int k = Integer.parseInt("20");
		
		//On peut aussi convertir une chaine de caract?re en un entier de type Wrapper
		Integer i = Integer.valueOf("210");
		System.out.println(i);
		
		//Convertir une chaien de caract?re en double
		Double d = Double.valueOf("35.14");
		
		//Les wrappers sont des objets des classes de type complexe ==> on peut appliquer des m?thodes
		//Tableau dynamique == collections
		
		//On peut convertir  les types de donn?es  primitifs en leurs objet de classe wrapper : auto-boxing
		int a = 56;
		Integer i1 = a; // auto-boxing
		
		//On ne peut pas cr?er une collection ou un tableau dynamique de type primitifs
		
		int a1 =45;
		tab.add(a1); //auto-boxing i.e il converti en type complexe
		
		//On a aussi l'unboxing qui est l'oppos? de l'auto-boxing o? nous convertissons l'objet de la classe wrapper 
		//ver son type primitif
		Integer s = 45;
		int a2 = s; //unboxing
		
		
		//Utilisation de l'autoboxing dans les tableaux dynamiques (ou collections)
		ArrayList<Integer> al2 =  new ArrayList<Integer>();
		int a3 = al2.get(0); //unboxing
		int val = a3 + 10;
		al2.add(val);
		
		
	}

}
