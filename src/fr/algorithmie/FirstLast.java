package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		int[] array = {6, 2, 3, 4, 5, 6};
		int lastIndex = array.length - 1;

		boolean ok;
		
		if(array.length >= 1 && (array[0] == array[lastIndex])) {
			ok = true;
		} else {
			ok = false;
		}
		
		System.err.println(ok);
	}

}
