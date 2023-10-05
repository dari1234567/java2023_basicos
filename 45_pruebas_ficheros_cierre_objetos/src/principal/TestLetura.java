package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestLetura {

	public static void main(String[] args) {
			try(FileReader f =new FileReader("c:\\temp\\dias.txt");
				BufferedReader bf=new BufferedReader(f) ;) {
				/*String line;
				while((line=bf.readLine())!=null){
					 System.out.println(line);
					 
					
					 }*/
				String dia;
				while ((dia=bf.readLine())!=null){
					System.out.println(dia);
				}
					

			}
			catch(FileNotFoundException ex) {
				ex.printStackTrace();
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
		}

}
