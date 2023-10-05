package principal;

import java.util.Scanner;

public class Verificador {

	public static void main(String[] args) {
		// realiar un programa que solicite la introduccion
		//de un email y nos diga y nos diga si es valida
		//direccion valida : contiene al menos u punto y un arroba
		
		Scanner sc = new Scanner (System.in);
		String correo;
		System.out.println("Introduce un correo");
		
		
		correo = sc.nextLine();
		sc.close();
		
		/* SOLUCION 1
		int posarroba=correo.indexOf("@");
		int pospunto =correo.indexOf(".");
		
		if (posarroba!=-1&&pospunto!=-1) {
			System.out.println("direccion valido");
		} else {
			System.out.println("direccion no valida");
		}
		 */ 
		
		
		 if (correo.contains("@") && correo.contains(".")){
			System.out.println("El correo es valido");
		}
		

	}

}
