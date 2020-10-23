
public class PrimeNumber {
	
	public static boolean[] isPrime(int number) {
		
		boolean[] primeNumber = new boolean[number];
		
		for (int i = 0; i < primeNumber.length; i++) {
			primeNumber[i] = true; 
		}
		
		for (int k = 2; k <= primeNumber.length; k++) {
			if (primeNumber[k-1]) {
				System.out.println(k);
				for (int j = 2*k; j <= primeNumber.length; j += k) {
					primeNumber[j-1] = false; 
				}
			}
		}
		
		return primeNumber; 
	}
	
}
