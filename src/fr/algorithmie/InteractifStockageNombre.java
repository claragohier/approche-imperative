package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		
		boolean again = true; 
		
		while(again == true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Veuillez choisir entre : \n 1. Ajouter un nombre \n 2. Afficher les nombres existants");
			int option = scanner.nextInt();
			int[] array = new int[2];
			
			if(option == 1) {
				System.out.println("Entrez un nombre :");
				int nb = scanner.nextInt();
				
				for(int i = 0; i < array.length; i++) {
					array[i] = nb;
				}
			} else if(option == 2) {
				for(int i = 0; i < array.length; i++) {
					System.out.println(array[i]);
				}
			} else {
				System.out.println("Option inconnue, veuillez choisir entre 1 et 2");
				option = scanner.nextInt();
			}
		}
		
	}

}
