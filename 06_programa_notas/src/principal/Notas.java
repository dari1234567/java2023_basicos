package principal;

public class Notas {

	public static void main(String[] args) {
		int nota = 6;
		/*En funcion de la nota muestra calificacion:
		Entre 1 y 4: suspenso
		Entre 5 y 6: aprobado
		7 y 8: notrable
		9 y 10: sobresaliente
		otro valor: nota no valida
		 */
		/*
		switch (nota) {
		case 1,2,3,4:
			System.out.println("suspenso");
		break;	
		
		case 5,6:
			System.out.println("aprobado");
		break;
		case 7, 8:
			System.out.println("notable");
		break;
		
		case 9,10:
			System.out.println("sobresaliente");
		break;
		
		default: System.out.println("nota no valida");
			
		}
		*/
		if (nota<5) {
			System.out.println("suspenso");
		}  else if (nota<7){
			System.out.println("aprobado");
		}	else if (nota>9) {
			System.out.println("notable");
		}	else if (nota>=9) {
			System.out.println("sobresaliente");
		} else {
			System.out.println("no valido");
		}
	}
	}
