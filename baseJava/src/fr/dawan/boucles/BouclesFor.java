package fr.dawan.boucles;

public class BouclesFor {

	public static void main(String[] args) {
		/*Exemple 1 : l'utilit? des boucles
		 */
		
		//Boucle for permet (for, while, do-while)
		
		
		/*
		 * Utilisation boucle for
		 * Elle s'utilise quand on connait le nombre d'it?rations
		 */
		
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("Le double de " + i + " est ?gal ?  " + i*2);
//		}
		// Boucle "While"
		int pushUpGoal = 0;
		while(pushUpGoal > 0) {
		   System.out.println ("Push up!");
		   pushUpGoal -= 1;
		   }
		// Boucle "do/while"
		int pushUpGoal1 = 0;
		do{
		   System.out.println ("Push up!");
		   pushUpGoal1 -= 1;
		} while (pushUpGoal1 > 0);
	}

}
