package fr.dawan.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice23 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int[]arr = new int[5];
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Veuillez rentrer le nombre " + (i + 1) + " :");
			arr[i] = clavier.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
		
        System.out.println(min);
        System.out.println(max);
	}

}
