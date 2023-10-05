package principal;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		//solicita la introduccion de un texto
		//y nos dice cuantas vocales tiene
		
	
		Scanner sc = new Scanner (System.in);
		String frase;
		System.out.println("Introduce una frase");
		frase = sc.nextLine();
		
		frase=frase.toLowerCase();
		int vocales = 0;
		for (int i =0; i<frase.length(); i++) {
			
			switch(frase.charAt(i)){
				case 'a', 'e', 'i', 'o', 'u':
					vocales++;
				break;
			}
			
		}
		System.out.println("Total de vocales:" +vocales);
	}
	

}
