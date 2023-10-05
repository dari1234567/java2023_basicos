package principal;

public class CalculosNotas {

	public static void main(String[] args) {
		String notas="4.5,2.7,8.9,5.1,3.4,9.0,6.7,7.2";
		String[] valores=notas.split(",");
		System.out.println("La media es: "+String.format("%.2f", media(valores)));
		System.out.println("total de aprobados: "+aprobados(valores));
		System.out.println("Nota mayor: "+mayor(valores));
		System.out.println("Nota menor: "+menor(valores));
	}
	
	static double media(String[] datos) {
		double r=0;
		for(String n:datos) {
			r+=Double.parseDouble(n);
		}
		return r/datos.length;
	}
	
	static int aprobados(String[] datos) {
		int total=0;
		for(String n:datos) {
			if(Double.parseDouble(n)>=5) {
				total++;
			}
		}
		return total;
	}
	static double mayor(String[] datos) {
		double m=Double.parseDouble(datos[0]);
		for(String s:datos) {
			if(Double.parseDouble(s)>m) {
				m=Double.parseDouble(s);
			}
		}
		return m;
	}
	
	static double menor(String[] datos) {
		double m=Double.parseDouble(datos[0]);
		for(String s:datos) {
			if(Double.parseDouble(s)<m) {
				m=Double.parseDouble(s);
			}
		}
		return m;
	}

}
