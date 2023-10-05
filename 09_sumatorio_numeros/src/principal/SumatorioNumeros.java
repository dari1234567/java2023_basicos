package principal;

import java.util.Scanner;

public class SumatorioNumeros {
	public static void main(String[]args) {
		//cambiar esto para que los numeros se pidan por treclado
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe un numero:");
		int a = sc.nextInt();
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Escribe otro numero:");
		int b = sc1.nextInt();
		
		//calcular la suma de todos los numeros comprendidos entre estos dos numeros
		
		int suma=0;
		
		int mayor=Math.max(a, b); //a>b?a:b; // hay que ver cual es la menor y la mayor primero, para poder hacer el ciclo
		int menor=Math.min(a, b);  //a>b?b:a;
		
		for (int i=menor; i<=mayor; i++) {
			suma = suma+i;
		}
		System.out.println("La suma es " +suma);
	}
}
