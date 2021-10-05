package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez choisir un rang : ");
		int rank = scanner.nextInt();
		int currentRank = 0;
		int nb1 = 0;
		int nb2 = 1;
		int newNb = 0;
		
		while(currentRank != rank) {
			
			if(currentRank != 0) {
				newNb = nb1 + nb2;
				nb1 = nb2;
				nb2 = newNb;
			}
			
			currentRank ++;
		}
		
		System.out.println(newNb);
		
	}

}
