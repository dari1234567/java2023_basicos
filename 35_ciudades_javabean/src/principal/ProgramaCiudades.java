package principal;

import java.util.Scanner;

import logica.CiudadesService;

public class ProgramaCiudades {
	
	
	static CiudadesService ciudadesService = new CiudadesService();
	public static void main(String[] args) {
		/*Una ciudad se caracteriza por un nombre, habitantes, y pais al que pertenece.
un programa donde vermos el siguiente menu

1. Nueva ciudad
2. Ciudades por pais
3. Ciudad mas poblada
4. Eliminar ciudad
5. Salir

1. pide los datos de la ciudad y la guarda
2. se pide el pais y muestra datos de todas sus ciudades
3. muestra los datos de la ciudad mas poblada
4. te pide el nombre de la ciudad que quieres eliminar y la elimina

Las ciudades se guardan en un arraylist*/

	}

	static void mostrarMenu() {
		System.out.println("1.- Nueva ciudad");
		System.out.println("2.- Ciudades por pais");
		System.out.println("3.- Ciudad mas poblada");
		System.out.println("4.- Eliminar ciudad");
		System.out.println("5.- Salir");
		
	}
	
	static void pedirCiudad() {
		
	}
	
}
