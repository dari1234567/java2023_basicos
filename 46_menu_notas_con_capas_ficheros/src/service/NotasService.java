package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class NotasService {
	
	String dir="c:\\temp\\notas.txt";
	
		public void guardarNotas(double nota) {
			try (FileOutputStream fos =new FileOutputStream(dir, true);PrintStream out= new PrintStream(fos);){
				
				
				out.println(nota);
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
				
			}
		
		public void eliminarNota(int pos) {
			//este no se hace
		}
		public double media() {
			double media = 0;
			int contador =0;
			try(FileReader f =new FileReader(dir);
				BufferedReader bf = new BufferedReader(f)) {
				String nota = null;
				while(nota!=null){
					contador++;
					media+=Double.parseDouble(nota);
					nota=bf.readLine();
					 
					

				}
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
			return media/contador;
		}
		
		
		public int aprobados() {
			int total = 0;
			try(FileReader f =new FileReader("c:\\temp\\notas.txt");
				BufferedReader bf=new BufferedReader(f) ;){
				String nota=bf.readLine();
				while(nota!=null){
					if(Double.parseDouble(nota)>=5) {
						total++;
					}
					nota=bf.readLine();
					 
					 }

			}
			catch(FileNotFoundException ex) {
				ex.printStackTrace();
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
			return total;
		}
	
		
		public ArrayList<Double> notas(){
			ArrayList<Double> notas =new ArrayList<>();
			try(FileReader f =new FileReader("c:\\temp\\notas.txt");
					BufferedReader bf=new BufferedReader(f) ;) {
					String nota=bf.readLine();
					while(nota!=null){
						 notas.add(Double.parseDouble(nota));
						 nota=bf.readLine();						 
						 }

				}
				catch(FileNotFoundException ex) {
					ex.printStackTrace();
				}
				catch(IOException ex){
					ex.printStackTrace();
				}
			return notas;
			}
		}

