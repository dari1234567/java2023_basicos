package principal;

import java.util.ArrayList;
import java.util.Scanner;


public class Aleatorios {

	public static void main(String[] args) {
		//realizar un programa  que vaya solicitando la introduccion de numeros enteros
		//y los ire guardando. Cada vez que pide un numero y lo guarda, preguntaa al usuario si desea introducir
		//otro numero. Cuando diga que no quiere introducir mas numeros, se mostrara la suma de todos los numeros
		//introducidos
		
		var lista = new ArrayList<Integer>();  //completo todas las variables que me van a hacer falta en mi programa
		var scNumeros = new Scanner(System.in);
		var scTextos = new Scanner (System.in);
		int num ;
		String resp;
		int suma = 0;
		
		do {
			System.out.println("Introduce un numero: ");
			num=scNumeros.nextInt();
			lista.add(num); //autoboxing de int a Integer
			System.out.println("¿Desea introducir otro numero? (si/no)");
			resp=scTextos.nextLine();
			
		}while(resp.equals("si"));
		for(int n:lista) {
			suma +=n;
		}
		System.out.println("La suma es:" + suma);
	}

}
