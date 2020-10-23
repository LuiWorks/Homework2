import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Please insert an integer. This number defines the amount of prime numberst to be safed in the file");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); 
		boolean[] primeNumber = PrimeNumber.isPrime(number); 
		
//		for (int i = 0; i < primeNumber.length; i++) {
//			primeNumber[i] = true; 
//		}
//		
//		for (int k = 2; k <= primeNumber.length; k++) {
//			if (primeNumber[k-1]) {
//				System.out.println(k);
//				
//				for (int j = 2*k; j <= primeNumber.length; j += k) {
//					primeNumber[j-1] = false; 
//				}
//			}
//		}

		scanner.close();
	}

}
