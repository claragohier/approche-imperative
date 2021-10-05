package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		int nb = 0;
		while(nb < 1 || nb > 10) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ecrire un nombre : ");
			nb = scanner.nextInt();
		}
        System.out.println("Table de " + nb);
        
        for(int i = 1; i <= 10; i++) {
        	System.out.println(i + " * " + i + " = " + nb * i);
        }
	}

}
