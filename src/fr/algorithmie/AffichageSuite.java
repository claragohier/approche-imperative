package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		
		step1();
		step2();
		step3();
		step4();
		step5();
		step6();

	}
	
	private static void step1() {
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
	}
	
	private static void step2() {
		
		for(int i=0; i<=10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
	}
	
	private static void step3() {
		
		for(int i=0; i<=10; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
	}
	
	private static void step4() {
		int i = 1;
		
		while(i < 11) {
			System.out.println(i);
			i++;
		}
		
	}
	
	private static void step5() {
		int i = 1;
		
		while(i < 11) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
	}
	
	private static void step6() {
		int i = 1;
		
		while(i < 11) {
			if(i%2 != 0) {
				System.out.println(i);
			}
			i++;
		}
		
	}

}
