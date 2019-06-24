package fileWriterAndBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramTres {

	public static void main(String[] args) {
		
		String[] lines = new String[] { "Good Morning", "Good Afternoon", "Good night"};
		
		String path = "C:\\Users\\andreygc\\Desktop\\Cursos\\Java Udemy\\Capitulo 12 - Manipulação de Arquivos\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for ( String line : lines ) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
			
		}
	}

}
