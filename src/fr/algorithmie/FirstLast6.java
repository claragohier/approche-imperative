package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		
		int[] array = {6, 2, 3, 4, 5, 6, 7};
		int lastIndex = array.length - 1;
		
		boolean ok;
		
		if(array.length > 0 && (array[0] == 6 || array[lastIndex] == 6)) {
			ok = true;
		} else {
			ok = false;
		}
		
		System.err.println(ok);
	}

}
