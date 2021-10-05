package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		int max = 0;
	
		for (int i = 0; i <= 9; i++) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ecrire un nombre : ");
			int nb = scanner.nextInt();
			
			array[i] = nb;
		}
		
		for(int i = 0; i <= 9; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println(max);
	}

}
