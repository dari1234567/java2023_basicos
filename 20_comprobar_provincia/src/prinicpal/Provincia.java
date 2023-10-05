package prinicpal;

public class Provincia {

	public static void main(String[] args) {
		String localidad = "Alcala de henares(Madrid)";
		//mostrar provincia a la que pertenece la localidad
		
		System.out.println("La provincia es " + localidad.substring(localidad.indexOf("(")+1, localidad.indexOf(")" )));

	}

}
