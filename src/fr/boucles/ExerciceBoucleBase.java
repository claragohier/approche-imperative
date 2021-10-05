package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {

		int i = 0;
		
		String nom = "Gohier";
		String prenom = "Clara";
		
		// 1 to 10
		step1(i);
		// 20 time name lastname
		step2(i, nom, prenom);
		// even elements (2 to 100)
		step3(i);
		// odd elements (1 to 99)
		step4(i);
		
	}
	
	private static void step1(int i) {
		for(i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	private static void step2(int i, String nom, String prenom) {
		for(i=1; i<=20; i++) {
			System.out.println(nom + ' ' + prenom);
		}
	}
	
	private static void step3(int i) {
		for(i=1; i<=100; i++) {
			if (i % 2 == 0) {
				System.out.println("Nombre pair : " + i);
			}
		}
	}
	
	private static void step4(int i) {
		for(i=1; i<=100; i++) {
			if (i % 2 != 0) {
				System.out.println("Nombre impair : " + i);
			}
		}
	}

}