package fr.dawan.condition;

import java.util.Scanner;

public class InstructionSwitch {

	public static void main(String[] args) {
		Scanner clavier = new Scanner (System.in);
		
		int jours = 7;
		
		//Fournir les donn�es d'entr�es 
		System.out.println("Saisir le num�ro du jour : 	");
		jours = clavier.nextInt();
		/*
		//Boucle else/if 
		if (jours == 1) {
			System.out.println("Nous sommes Lundi !");
		} else if (jours == 2) {
			System.out.println("Nous sommes Mardi ! ");
		}else if (jours == 3) {
			System.out.println("Nous sommes Mercredi !");
		}else if (jours == 4) {
			System.out.println("Nous sommes Jeudi !");
		}else if (jours == 5) {
			System.out.println("Nous sommes Vendredi");
		}else if (jours == 6) {
			System.out.println("Nous sommes Samedi ");
		}else if (jours == 7) {
			System.out.println("Nous sommes Dimanche");
		}else {System.out.println("Entr�e invalide !!");
		}
		*/
		//Switch
		switch(jours) {
		case 1 :System.out.println("Nous sommes Lundi !");
		break;
		case 2:System.out.println("Nous sommes Mardi ! ");
		break;
		case 3:System.out.println("Nous sommes Mercredi ! ");
		break;
		case 4:System.out.println("Nous sommes Jeudi ! ");
		break;
		case 5:System.out.println("Nous sommes vendredi ! ");
		break;
		case 6:System.out.println("Nous sommes samedi ! ");
		break;
		case 7:System.out.println("Nous sommes dimanche ! ");
		break;
		default: System.out.println("Entr�e invalide !!");
		break;
		
		

		}
		
		
	
	}

}
