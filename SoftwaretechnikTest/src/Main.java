import java.util.Scanner;

/**
* Saves a specific amount of prime numbers in a file you can name. 
* 
* You will be asked for a amount of prime numbers and for a name of the file that will be created. 
* Calls a method that creates a array with the wanted numbers, than calls a method that saves the array into a txt file. 
* 
*/

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Please insert an integer. This number defines the amount of prime numberst to be safed in the file");
		
		Scanner _scanner = new Scanner(System.in);
		int _numbers = _scanner.nextInt(); 
		int[] _primeNumbers = PrimeNumber.isPrime(_numbers); 
		

		System.out.println("Do you want to set a filename? Please press y for yes and n for no. ");
		
		String _input = _scanner.next(); 
		String _fileName = "Primenumbers"; 
		switch(_input) {
			case "y": 
				System.out.println("please insert a filename");
				_fileName = _scanner.next(); 
				ToFile.makeFile(_primeNumbers, _fileName);
				break; 
		
			case "n":
				ToFile.makeFile(_primeNumbers, _fileName);
				break; 
				
			default:
				break; 
		}

		_scanner.close();
	}
}
