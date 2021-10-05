package fr.algorithmie;
import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		
		int nb = 0;
		while(nb < 1 || nb > 10) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ecrire un nombre : ");
			nb = scanner.nextInt();
		}
        System.out.println(nb);
	}

}
