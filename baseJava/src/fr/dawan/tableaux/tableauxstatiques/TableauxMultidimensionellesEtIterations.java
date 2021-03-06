package fr.dawan.tableaux.tableauxstatiques;
import java.util.Arrays;

public class TableauxMultidimensionellesEtIterations {

	public static void main(String[] args) {
		
		int[][] scores = {{5, 25, 72, 16, 38}, 
						{90, 7, 30}, 
						{37, 97, 1, 52}};
		System.out.println(Arrays.deepToString(scores));
		
		//Le premier for parcourt les lignes
		for(int i = 0, nbRows = scores.length; i < nbRows; i++) {
			for(int j = 0, nbColumns = scores[i].length; j < nbColumns; j++) {
				System.out.println(scores[i][j]);
				}
			System.out.println();
		}
		
	}

}
