package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		int[] entiers = { 1,2,3,4,5,6,7,8,9,10 };
		
		// display first element
		step1(entiers);
		// display length
		step2(entiers);
		// display last element
		step3(entiers);
		// change value of index 4
		step4(entiers);
	}
	
	private static void step1(int[] array) {
		System.out.println(array[0]);
	}
	
	private static void step2(int[] array) {
		System.out.println(array.length);
	}
	
	private static void step3(int[] array) {
		System.out.println(array[array.length-1]);
	}
	
	private static void step4(int[] array) {
		array[4] = 8;
		System.out.println(array[4]);
	}
}
