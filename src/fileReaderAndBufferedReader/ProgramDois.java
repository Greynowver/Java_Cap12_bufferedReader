package fileReaderAndBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramDois {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\andreygc\\Desktop\\Cursos\\Java Udemy\\Capitulo 12 - Manipulação de Arquivos\\Teste.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			/* ou da seguinte forma:
			
			br = new BufferedReader(new FileReader(path));
			
			*/
			
			String line = br.readLine();
			
			while ( line != null ) {
				System.out.println(line);
				line = br.readLine();
			}
			
			
		}
		catch( IOException e) {
			System.out.println("Erro :" + e.getMessage());
		}
		finally {
			try {
			if ( br != null) {
				br.close();
			}
			if ( fr != null) {
				fr.close();
			}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
