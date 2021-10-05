package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {

		int baton = 21;
		int nbJ;
		int nbO;
		
		boolean ordi = false;
		
		while(baton >= 1) {
			
			if(ordi == false) {
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("Entrez un chiffre : 1, 2 ou 3");
				nbJ = scanner.nextInt();

				if(nbJ == 1 || nbJ == 2 || nbJ == 3) {

					baton -= nbJ;
					
					System.out.println("Il reste " + baton + " batons");
					ordi = true;
				} else {
					System.out.println("Chiffre non correct");
					nbJ = scanner.nextInt();
				}
			} else {
				nbO = (int)(Math.random()*2 + 1);
				baton -= nbO;
				
				System.out.println("ordi a choisi " + nbO);
				System.out.println("Il reste " + baton + " batons");
				ordi = false;
			}
			
			
		}
		
		if(ordi == true) {
			System.out.println("Felicitations ordinateur");
		} else {
			System.out.println("Felicitations moi");
		}
		
		
	}

}
