package principal;

public class Mensaje {
	
	public static void main (String[] args) {
	int precio = 7;
	/*el programa comprueba el precio, si es 10 muestra un mensjae
	 * que dice "muy caro", si es 9 "caro", si es 8 "aceptable", si es
	 * otro precio "novalido"
	 */
		switch (precio) {
		case 10: 
			System.out.println("Muy caro");
			break;
		case 9: 
			System.out.println("caro");
			break;
		case 8: 
			System.out.println("aceptable");
			break;
		case 7: 
			System.out.println("normal");
			break;
		default : System.out.println("no valido");
			
			
			
		
			}
		}			
	}
