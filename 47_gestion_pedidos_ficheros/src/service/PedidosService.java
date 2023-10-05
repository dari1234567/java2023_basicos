package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import model.Pedido;



public class PedidosService {
	
	public PedidosService(){
		File file = new File(dir);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	
	String dir = "c:\\temp\\pedidos.txt";
	public void guardarPedido(String producto, LocalDate fechaPedido,double precio) {
		String linea = producto+","+fechaPedido+","+precio;
		try (FileOutputStream fos =new FileOutputStream(dir, true);PrintStream out= new PrintStream(fos);){
			out.println(linea);
			
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	
	public Pedido pedidoMasReciente() {
		Pedido pedidoReciente=null;
		try(FileReader f =new FileReader("c:\\temp\\pedidos.txt");
				BufferedReader bf=new BufferedReader(f) ;){
				String linea=bf.readLine();
				if(linea==null) {
					return null;
				}
				String [] datos = linea.split(",");
				pedidoReciente=new Pedido(datos[0],LocalDate.parse(datos[1]),Double.parseDouble(datos [2]));
				LocalDate fechaReciente =pedidoReciente.getFechaPedido();
				linea = bf.readLine();
				while(linea!=null){
					
					datos = linea.split(",");
					Pedido p =new Pedido(datos[0],LocalDate.parse(datos[1]),Double.parseDouble(datos [2]));
					if(p.getFechaPedido().isAfter(fechaReciente)) { //si encontramos una fecha más reciente, actualizamos variables
						fechaReciente=p.getFechaPedido();
						pedidoReciente=p;
					}
					linea=bf.readLine();
				}

		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return pedidoReciente;
		
	}
	
	public ArrayList<Pedido> pedidosPrecio(double precioMax) {
		ArrayList<Pedido> resultado=new ArrayList<Pedido>();
		try(FileReader f =new FileReader("c:\\temp\\pedidos.txt");
				BufferedReader bf=new BufferedReader(f) ;) {
				String line;
				while((line=bf.readLine())!=null){
					 System.out.println(line);
					 
					 }

			}
			catch(IOException ex){
				ex.printStackTrace();
			}
		return resultado;
	}
	
	public ArrayList<Pedido> anteriores(int meses){
		ArrayList<Pedido> resultado=new ArrayList<>();
		LocalDate referencia=LocalDate.now().minusMonths(meses);								
		try(FileReader f=new FileReader(dir); 
			BufferedReader bf= new BufferedReader(f)) {			
			String linea=bf.readLine();	
			
			while (linea!=null) {					
				String[]datos=linea.split(",");
				Pedido p=new Pedido (datos[0], LocalDate.parse(datos[1]), Double.parseDouble(datos[2]));
				if(p.getFechaPedido().isBefore(referencia)){
					resultado.add(p);						
				}
				linea=bf.readLine();
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
							
		return resultado;
	}			
}
