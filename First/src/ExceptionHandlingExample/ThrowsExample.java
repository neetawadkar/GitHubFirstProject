package ExceptionHandlingExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
	
	public static void main(String args[]) throws IOException
	{
		FileReader file = new FileReader("C:\\test\\a.txt");
		BufferedReader fileInput = new BufferedReader(file);
		
		for (int counter = 4; counter>0; counter--)
			System.out.println(fileInput.readLine());
		
		fileInput.close();
	}

}
