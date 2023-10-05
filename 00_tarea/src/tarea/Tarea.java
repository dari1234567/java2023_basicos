package tarea;

public class Tarea {
 
	    public static void main(String[] args) {

	    	double[] temps = {12.4, 23.3, 17.9, 30.1, 22.4, 17.8};
	        double media = 0; //declarar un variable para la media
	        double suma = 0; // declarar una variable para la suma
	        int porEncima = 0; //declarar una variable para los meses por encima de la media
	        for (double temp : temps) {
	            suma += temp;
	            
	        }

	        media = suma / temps.length;

	        System.out.println("la media es de " + media);

	        for (double temp : temps) {
	            if (temp > media) {
	                porEncima++;
	            }

	               
	        
	    }
	        System.out.println("Meses con temperatura superior a la media: " + porEncima);
	    }
}
	


