package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import logica.AgendaService;
import model.Contacto;


public class ProgramaAgenda {
	
	/*Agenda de contactos

1.-Nuevo contactos
2.-Buscar contacto
3.-Eliminar contacto
4.-Mostrar todos los nombres
5.-Salir

Un contacto se caracteriza por: nombre, email, telefono, edad. 


1.- Se pide el nombre, email, edad y el telefono. Si no existe un contacto
con ese email, se guarda, si ya existe, mensaje de error
2.- Se pide el email del contacto y se muestran sus datos. Si no hay contacto con ese email, mensaje
3.-Se pide el email y se elimina el contacto. Si no existe, mensaje
4. Muestra los datos de todos los contactos
*/

	static AgendaService agendaService=new AgendaService();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		
		do {
			mostrarMenu();
			try {
				opcion=Integer.parseInt(sc.nextLine());//lee la opción elegida
				switch(opcion) { //evaluamos
					
				case 1:
						pedirContacto();
						break;
					case 2:
						buscarContacto();
						break;
					case 3:
						eliminarContacto();
						break;
					case 4:
						mostrarNombres();
						break;
					
					case 5:
						System.out.println("---Adios---");
				}
			}catch(NumberFormatException ex){
				System.out.println("debes introducir un numero");
				opcion = 0;
			}
				
			
			
			
		}while(opcion!=5);
	}
	static void mostrarMenu() {
		System.out.println("1.- Nuevo contacto");
		System.out.println("2.- Buscar contacto");
		System.out.println("3.- Eliminar contacto");
		System.out.println("4.- Mostrar nombres");
		System.out.println("5.- Salir");
		
	}
	static void pedirContacto() {
		
		Scanner sc=new Scanner(System.in);
		String email;
		String nombre;
		int edad;
		int telefono;
		System.out.println("Introduce Email");
		email=sc.nextLine();
		System.out.println("Introduce nombre");
		nombre=sc.nextLine();
		System.out.println("introducte tu edad");
		edad=Integer.parseInt(sc.nextLine());
		System.out.println("introducte tu telefono");
		telefono=edad=Integer.parseInt(sc.nextLine());
		
		AgendaService agendaService2 = new AgendaService();
		agendaService2.agregar(email, nombre, edad, telefono);
	}
	static void buscarContacto() {
		Scanner sc=new Scanner(System.in);
		String email;
		Contacto contacto;
		System.out.println("Introduce email");
		email=sc.nextLine();
		contacto=agendaService.buscar(email);
		if(contacto!=null) {
			System.out.println(contacto.getNombre()+ "-" + contacto.getEdad());
		}else {
			System.out.println("no se ha encontrado");
		}
	}
	static void eliminarContacto() {
		Scanner sc=new Scanner(System.in);
		String email;
		System.out.println("Introduce email");
		email=sc.nextLine();
		agendaService.eliminar(email);
	}
	static void mostrarNombres() {
		Contacto[] contactos=agendaService.contactos();
		for(Contacto c:contactos) {
			System.out.println(c.getNombre()+"-" +c.getEdad());
		}
	}

}

