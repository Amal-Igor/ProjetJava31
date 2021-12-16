package fr.dawan.exercices;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercice22 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		int[]arr = new int[5];
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Veuillez rentrer le nombre " + (i + 1) + " :");
			arr[i] = clavier.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));		

		int sum = IntStream.of(arr).sum();
		
		System.out.println(sum);
		


	}

}
