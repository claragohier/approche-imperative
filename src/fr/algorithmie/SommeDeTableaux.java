package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		int sum = 0;
		
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		
		for(int i=0; i<array2.length; i++) {
			sum += array2[i];
		}
		
		System.out.println(sum);
	}

}
