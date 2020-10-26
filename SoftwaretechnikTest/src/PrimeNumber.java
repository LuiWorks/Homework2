/**
 * Method searching for prime numbers, saves them in an int array 
 * 
 * Creates an boolean array and sets all values to true. The array will be expanded if there is more space needed. 
 * The prime numbers a "sieved" with the sieve of Eratosthenes. 
 * When the wanted number is reached the method returns the array filled with prime numbers.
 */
public class PrimeNumber {
	
	public static int[] isPrime(int number) {
		
		boolean[] _isPrimeNumber = new boolean[number];
		int[] _primeNumbers = new int[number]; 
		int _foundPrime = 0; 
		
		for (int i = 0; i < _isPrimeNumber.length; i++) {
			_isPrimeNumber[i] = true; 
		}
		
		int k = 2; 
		do {

			if (k <= _isPrimeNumber.length  && _foundPrime < number ) {
				boolean[] _temp = new boolean[_isPrimeNumber.length + 100]; 
				System.arraycopy(_isPrimeNumber, 0, _temp, 0, _isPrimeNumber.length);
				
				for (int i = _isPrimeNumber.length; i < _temp.length; i++ ) {
					_temp[i] = true; 
				}
				_isPrimeNumber = _temp; 
			}
			
			
			if (_isPrimeNumber[k-1]) {
				_primeNumbers[_foundPrime] = k; 
				_foundPrime++; 
				for (int j = 2*k; j <= _isPrimeNumber.length; j += k) {
					_isPrimeNumber[j-1] = false; 
				}
			}
			
			k++; 
		} while (k < _isPrimeNumber.length && _foundPrime < number ); 
		
		return _primeNumbers; 
	}
	
}
