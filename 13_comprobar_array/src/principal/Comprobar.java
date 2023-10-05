package principal;

public class Comprobar {
	public static void main(String[]args) {
		/*
		int[] nums = {3,5,11,2,-3,7,23,-4};
		boolean  negativo=false;
		//hay algun numero negativo en el array
		
			for(var n:nums) {
				if (n<0) {
					negativo=true;
					break;
				}
		}
		if(negativo==true) {
			System.out.println("Habia negativo");
			
		} else {
			System.out.println("No habia negativo");
		}
	*/
		double[] temps = {12.4, 23.3, 17.9, 30.1, 22.4, 17.8};
        double media = 0; //declarar un variable para la media
        double suma = 0; // declarar una variable para la suma
        int porEncima = 0; //declarar una variable para los meses por encima de la media
        for (double temp : temps) {
            suma += temp;
            System.out.println("la suma de las temperaturas es " + suma);
        }

        media = suma / temps.length;

        System.out.println("la media es de " + media);

        for (double temp : temps) {
            if (temp > media) {
                porEncima++;
            }

            System.out.println("Meses con temperatura superior a la media: " + porEncima);

        }
	  }
	 
}
