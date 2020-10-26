import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Class that safes the content of an array (array of prime numbers) into a txt file. 
 * 
 * Class receives a param containing an int array filled with prime numbers and a param containing a name for the txt file.
 *
 */
public class ToFile {

	public static void makeFile(int[] _primeNumbers, String _fileName) {
		writeInFile((createFile(_fileName)) , _primeNumbers);
	}

	/**
	 * Method creating a bare txt file in the project folder.
	 * The filename is set as desired. 
	 * 
	 * @param _fileName the name the file will get
	 * @return a bare file, named as desired 
	 */
	public static File createFile(String _fileName) {
		File _file = null; 
		StringBuilder _name = new StringBuilder();
		_name.append(_fileName); 
		_name.append(".txt"); 
		
		try {
			_file = new File(_name.toString());
			if (_file.createNewFile()) {
			}
			else {
				System.out.println("File already exists");
			}
		}
		catch (Exception e) {
			System.err.println(e);
		}
		
		return _file; 
	}	

	/**
	 * Method that writes the content of an array into a file 
	 * @param _file the file to be written in 
	 * @param _primeNumbers the array containing prime numbers, will be written into the file 
	 */
	public static void writeInFile(File _file, int[] _primeNumbers) {
		
		try {
	
			FileWriter _writer = new FileWriter(_file);
			StringBuilder _numberString = new StringBuilder(); 
	
			for (int i = 0; i < _primeNumbers.length; i++) {
				_numberString.append(_primeNumbers[i] + " "); 
			}
			
			_writer.write(_numberString.toString());
			_writer.close();
				
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}

}

