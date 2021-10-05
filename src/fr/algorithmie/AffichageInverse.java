package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		step1(array);
		step2(array);
		
		// step3
		int[] arrayCopy = new int[array.length];
		System.arraycopy(array, 0, arrayCopy, 0, array.length);

	}
	
	private static void step1(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	private static void step2(int[] array) {

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}

	}

}
