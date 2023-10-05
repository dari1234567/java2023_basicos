package principal;

public class CalculoEdades {
	
	 // var n=7; no valido para atributo solo variables locales
	public static void main(String[]args) {
		
		var edades= new int [] {34,19,28,55,61,40};
		//que calcule la media de edad
		//edad mayor y menor
		
		
		double suma = 0; //se declara el valor de la suma que sera un numero double
		int mayor=edades[0]; // para buscar el mayor
		int menor=edades[0];	// para el menor
		for (int i=0; i<edades.length; i++) { //se hace el ciclo for para que recorra el array
			suma += edades[i]; //se suman todos los numeros del array
			
			if (edades[i]>mayor) {
				mayor=edades[i];
			}
			if(edades[i]<menor) {
				menor = edades[i];
			}
			
		}
		
		for(int e:edades) {
			suma+=e;
			if(e>mayor) {
				mayor=e;
			}
			if(e<menor) {
				menor=e;
			}
		}
		
		System.out.println("La media es " + suma/edades.length); //se divide entre el numero de posiciones del array
		System.out.println("Edad mas alta " +mayor);
		System.out.println("Edad mas baja " +menor);
		
	}
}

