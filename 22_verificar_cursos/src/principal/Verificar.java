package principal;

public class Verificar {
	public static void main(String[] args) 
		{
			String cursos="Ofimatica,Java básico,JavaEE,Spring Boot,Angular,Programacion avanzada en Java";
			String [] nombres = cursos.toLowerCase().split(",");
			
			int contador = 0;
			
			for (String n:nombres) {
				if(n.contains("java")){
					contador++;
				}
			}
			System.out.println("Cursos de Java: " + contador);
		}
	}

