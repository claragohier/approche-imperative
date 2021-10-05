package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// superior 3
		step1(array);
		// even int
		step2(array);
		// even index
		step3(array);
		// odd int
		step4(array);
	}

	private static void step1(int[] array) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				System.out.println(array[i]);
			}
		}

	}

	private static void step2(int[] array) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}

	}

	private static void step3(int[] array) {

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.println(array[i]);
			}
		}

	}

	private static void step4(int[] array) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.println(array[i]);
			}
		}

	}

}
