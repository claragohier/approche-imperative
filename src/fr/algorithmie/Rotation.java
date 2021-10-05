package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		int[] array = { 6, 2, 3, 4, 5, 6, 7 };
		
		// rotation of 1
		int d = 1;
		int n = array.length;

		int temp[] = new int[n - d];
		
		for (int i = 0; i < n - d; i++) {
			temp[i] = array[i];
		}

		for (int i = n - d; i < n; i++) {
            array[i - n + d] = array[i];
		}

		for (int i = d; i < n - d; i++) {
			array[i + d] = temp[i];
		}

		System.out.println(array[0]);
	}

}
