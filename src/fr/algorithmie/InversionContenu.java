package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
		int[] arrayCopy = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			int temp = array[i];
			arrayCopy[i] = array[array.length - 1 - i];
			arrayCopy[array.length - 1 - i] = temp;
		}
		
		System.out.println("array : ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("arrayCopy : ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(arrayCopy[i]);
		}
		
	}
	

}
