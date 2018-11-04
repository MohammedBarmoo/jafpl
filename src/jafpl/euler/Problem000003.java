package jafpl.euler;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
 * factor of the number 600851475143?
 * 
 * Die Primfaktoren der Zahl 13195 sind 5, 7, 13 und 29. Was ist der größte
 * Primfaktor der Zahl 600851475143?
 * 
 * @author Mohammed Barmoo
 *
 */
public class Problem000003 {

	public static void main(String[] args) {
		long sum = 600851475143L;
		for (long l =2; l < sum; l++) {
		System.out.println();
		
	
		}

	}public static String solve(long seed) {
		for (long i = 2; i*i < seed; i++) {
			if (seed % i == 0); 
			
			
		}
		return Long.toString(seed);
	}
		
		
		

	public static String solve(long seed , long factor) {
		long groeszterPrimfaktor = 0;
	
		return Long.toString(groeszterPrimfaktor);
	}

}
