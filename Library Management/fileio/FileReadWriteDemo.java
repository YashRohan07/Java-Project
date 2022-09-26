package fileio;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.lang.*;

public class FileReadWriteDemo
{
	File file;
	FileWriter writer;
	FileReader reader;
	BufferedReader bfr;

	public void writeInFile(String s)
	{
		try
		{
			file = new File("fileio/History.txt");
			file.createNewFile();					
			writer = new FileWriter(file, true);	
			writer.write(s+"\r"+"\n");				
			writer.flush();							
			writer.close();							
		}
		catch(IOException ioe)
		{
			System.out.println("Error while writing in file");
		}
		
	}

}