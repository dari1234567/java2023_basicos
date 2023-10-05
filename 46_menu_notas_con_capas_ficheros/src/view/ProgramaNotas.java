package view;

import java.util.ArrayList;
import java.util.Scanner;

import service.NotasService;

public class ProgramaNotas {

	public static void main(String[] args) {
		int opcion;
		NotasService notasService=new NotasService();
		Scanner sc = new Scanner(System.in);
		do {
			mostrarMenu();
			opcion =sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Introduce un nota");
				notasService.guardarNotas(sc.nextDouble());;
				break;
			case 2:
				System.out.println("Introduce una posicion");
				notasService.eliminarNota(sc.nextInt());
				break;
			case 3:
				System.out.println("La nota media es" +notasService.media());
			break;
			case 4:
				System.out.println("Total de aprobados" +notasService.aprobados());
				break;
			case 5:
				var notas=notasService.notas();
				for (double n:notas) {
					System.out.println(n);
				}
				break;
			case 6:
				System.out.println("---Adios---");
			

			}
		}while (opcion!=6);
		
		

	}
	static void mostrarMenu() {
		System.out.println("1. Añadir nota");
		System.out.println("2. Eliminar nota por posicion");
		System.out.println("3. Nota media");
		System.out.println("4. Total aprobados");
		System.out.println("5. MostrAR TODAS NOTAS");
		System.out.println("6. Salir");
		
	}

}
