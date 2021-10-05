package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};
		int sum = 0;
		int sum2 = 0;
		
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		
		for(int i=0; i<array2.length; i++) {
			sum2 += array2[i];
		}
		
		int diff = sum - sum2;
		
		System.out.println(diff);
		
	}

}
