package fr.dawan.exercices;

import java.util.Scanner;

public class Exercice11 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int a, b;
		String operateur = "";
		
		System.out.println("Veuillez renseigner une premier chiffre : ");
		a = clavier.nextInt();
		System.out.println("Quelle op�ration souhait� vous effectuer + - / * ? ");
		operateur = clavier.next();
		System.out.println("Veuillez renseigner une deuxi�me chiffre : ");
		b = clavier.nextInt();
	
			
		switch(operateur) {
		case "+" : System.out.println("Le resultat  est �gal � : " + (a+b));
		break;
		case "-": System.out.println("Le r�sultat est �gale � : " + (a-b));
		break;
		case "/": System.out.println("Le r�sultat est �gale � : " + (a/b));
		break;
		case "*": System.out.println("Le r�sultat est �gale � : " + (a*b));
		break;
		default: System.out.println("Entr�e invalide !!");
		break;
		};
		

		
		
	}

}
