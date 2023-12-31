package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		/* Realizar un programa para la gestión de notas.
		El programa mostrará el siguiente menú al iniciarse:
			1.Añadir nota
			2.Eliminar nota por posición
			3.Nota media
			4.Total de aprobados
			5.Salir

			Al elegir una opción, se realizarán las acciones pertinentes
			y después se mostrará otra vez el menú, hasta
			que se elija la opción de salir */

		int opcion;
		ArrayList<Double> notas = new ArrayList<>(); 
		Scanner sc = new Scanner(System.in);
		do {
			mostrarMenu();
			opcion =sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Introduce un nota");
				notas.add(sc.nextDouble());
				break;
			case 2:
				System.out.println("Introduce una posicion");
				break;
			case 3:
				System.out.println("La nota media es" +media(notas));
			break;
			case 4:
				System.out.println("Total de aprobados" +aprobados(notas));
				break;
			case 5:
				System.out.println("---Adios---");
			

			}
		}while (opcion!=5);
		
		
	}
	static void mostrarMenu() {
		System.out.println("1. Añadir nota");
		System.out.println("2. Eliminar nota por posicion");
		System.out.println("3. Nota media");
		System.out.println("4. Total aprobados");
		System.out.println("5. Salir");
	}
	static double media (ArrayList<Double> notas) {
		double res = 0;
				for (double d:notas) {
					res += d;
				}
				return res/notas.size();	
			}
	
	static int aprobados (ArrayList<Double> notas) {
		int cont = 0;
		for (double d:notas) {
			if (d>=5) {
				cont++;
			}
		}
		return cont;
	}
}
