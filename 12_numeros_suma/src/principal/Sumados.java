package principal;

public class Sumados {

	public static void main(String[] args) {
		//cuantos numeros, empexando por 1, tenemos que sumar
		//hasta alcanzar o superar 1000?
		
		var suma = 0;
		var n=0;
		
		while(suma<1000) {
			n++;
			suma+=n;
		}
		System.out.println("Hay que suma hasta: " +n);

	}

}
