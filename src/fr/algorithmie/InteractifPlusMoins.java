package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		int random = (int)(Math.random()*100);
		int nb = 0;
		int i = 0;
		
		while(nb != random) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ecrire un nombre : ");
			nb = scanner.nextInt();
			
			if(nb > random) {
				System.out.println("Nombre trop grand");
			} else if(nb < random) {
				System.out.println("Nombre trop petit");
			} else {
				System.out.println("Bravo, vous avez trouvé en " + i + " coups");
			}
			
			i++;
		}
	}

}
