package principal;

public class CalculosNotas2b {

	public static void main(String[] args) {
		String notas = "4.5,2.7,8.9,5.1,3.4,9.0,6.7,7.2";
		
		//hacer un programa que calcule la nota media, nota mas baja, nota mas alta, total aprobados
		
		String [] notas1= notas.split(","); //se divide el array quitando la coma
		double media = 0; //creamos una variable para la media 
		double mayor= Double.parseDouble(notas1[0]); //creamos una variable para la nota mayor, pero como es string hay que convertirlo con el Double.parseDouble
		double menor =Double.parseDouble(notas1[0]); //lo mismo, siempre iniciando en la posicion 0
		int aprobados = 0; //iniciamos una variable de los aprobados
		for (String s:notas1) {
			double nota=Double.parseDouble(s); //creamos una variable para no tener que escribir Double.parseDouble tantas veces porqu nos hara falta para hacer la media y los ifs para ver la nota mas alta y la mas baja
			media+=nota;
			
			if (nota >= 5) { // sentencia if para ir sumando los aprobados mientras recorre el array
				aprobados++;
			}
			if (nota > mayor) {
				mayor = nota;
			}
			if(nota<menor) {
				menor=nota;
			}
		}
		System.out.println("Resultado "+String.format("%.2f", media/notas1.length));
		System.out.println(media/notas1.length);
		System.out.println(aprobados++);
		System.out.println(mayor);
		System.out.println(menor);
		
	}

}
