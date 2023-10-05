package principal;

import java.util.Arrays;

public class Bonoloto {

	public static void main(String[] args) {
		int[] combinacion = new int [6];
		int generados = 0;
		while(generados < 6) {
			int n =(int) (Math.random()*49+1);
			if(!repetido(combinacion,n,generados)) {
				combinacion[generados]=n;
				generados++; //incrementeamos la variable al haber generado un nuevo numero
			}
		}
		ordenar(combinacion);
		mostrar(combinacion);
	}
	
	static boolean repetido(int[] numeros, int num, int total) {
		/* boolean res=false;
		for (int i=0; i<total;i++) {
			if(numeros[i]==num) {
				res =true;
				break;
			}
		}
		return res; */ //otra forma de hacerlo
		
		for (int i =0;i<total; i++) {
			if(numeros[i] ==num) {
				return true;
			}
		}
		return false;
	}
	static void ordenar (int[] numeros) {
		int aux;
		for (int i = 0; i<numeros.length; i++) {
			for (int j=i+1; j<numeros.length; j++) {
				if(numeros[j]<numeros[i]) { //sustitucion
					aux =numeros[j];
					numeros[j] = numeros[i];
					numeros[i] = aux;
					
				}
			}
		}
	}
	
	static void mostrar(int[] numeros) {
		for (int n:numeros) {
			System.out.print(n+",");
		}
	}
}