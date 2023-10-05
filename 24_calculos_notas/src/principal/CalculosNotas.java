package principal;

public class CalculosNotas {

	public static void main(String[] args) {
		String notas = "4.5,2.7,8.9,5.1,3.4,9.0,6.7,7.2";
		
		//hacer un programa que calcule la nota media, nota mas baja, nota mas alta, total aprobados
		
		String [] notas1= notas.split(","); //se divide el array quitando la coma
		
		System.out.println("Resultado "+String.format("%.2f", media(notas1)));
		System.out.println(aprobados(notas1));
		System.out.println(mayor(notas1));
		System.out.println(menor(notas1));
			}

	 static double media(String[] notas1) {
		double r = 0;
		
		
		for (String n:notas1) {
			r += Double.parseDouble(n);
		}
		return r;
		
	}

	 static int aprobados (String [] notas1) {
		int total = 0;
		for (String n:notas1) {
			if (Double.parseDouble(n) >= 5) {
				total++;
			}
	}
		return total;
	
	
	}
	static double mayor (String[]notas1) {
		double m = Double.parseDouble(notas1[0]);
		for (String s:notas1) {
			if(Double.parseDouble(s)>m) {
				m = Double.parseDouble(s);
			}
		}
		return m;
	}
	static double menor (String[]notas1) {
		double m = Double.parseDouble(notas1[0]);
		for (String s:notas1) {
			if(Double.parseDouble(s)>m) {
				m = Double.parseDouble(s);
			}
		}
		return m;
	}
}
