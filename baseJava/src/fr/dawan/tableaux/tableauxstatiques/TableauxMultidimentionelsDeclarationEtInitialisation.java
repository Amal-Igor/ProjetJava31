package fr.dawan.tableaux.tableauxstatiques;

import java.util.Arrays;

public class TableauxMultidimentionelsDeclarationEtInitialisation {

	public static void main(String[] args) {
		
		//int[] scores = {10, 20, 30};
		//Cr?ation d'un tableau ? deux dimensions 
		int[] [] scores = new int[2][3];/// le premier [] ligne le deuxi?eme [] colones
		
		int[][] scores1 = {{5, 25, 72, 16,98}, {90, 7, 30, 67,29}};
		System.out.println(Arrays.deepToString(scores1));
		
		int[][] scores2 = new int[2][2];
		
		
	}

}
