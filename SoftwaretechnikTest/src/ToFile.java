import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ToFile {
	
	// junit Methoden anlegen zum testen
	// https://www.youtube.com/watch?v=jtsHJufkDfU
	
	public static void makeFile(int[] _primeNumbers, String _fileName) {

		writeInFile((createFile(_fileName)) , _primeNumbers);
		
	}
	
	
	
	
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

