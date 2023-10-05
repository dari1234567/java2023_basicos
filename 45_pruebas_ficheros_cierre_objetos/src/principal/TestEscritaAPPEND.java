package principal;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestEscritaAPPEND {

	public static void main(String[] args) {
		
		try (FileOutputStream fos =new FileOutputStream("c:\\temp\\dias.txt", true);PrintStream out= new PrintStream(fos);){
			//se necesita un objeto auxiliar para configurar la forma de escritura
			
			//a partir del objeto anterior, creamos el PrintStream
			
			out.println("jueves");
			out.println("viernes");
			
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
			
		}

	}


