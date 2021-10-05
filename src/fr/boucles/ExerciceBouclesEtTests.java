package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// display array
		step1(array);
		// array reverse
		step2(array);
		// superior 3
		step3(array);
		// even int
		step4(array);
		// even index
		step5(array);
		// odd int
		step6(array);

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

	private static void step3(int[] array) {

		for (int i = 0; i < array.length; i++) {
			if(array[i] > 3) {
				System.out.println(array[i]);
			}
		}

	}
	
	private static void step4(int[] array) {

		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}

	}
	
	private static void step5(int[] array) {

		for (int i = 0; i < array.length; i++) {
			if(i % 2 == 0) {
				System.out.println(array[i]);
			}
		}

	}
	
	private static void step6(int[] array) {

		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 != 0) {
				System.out.println(array[i]);
			}
		}

	}

}
