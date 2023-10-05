
public class ComprobarTextos {

	public static void main(String[] args) {
		String productos ="Detergente,Vino,Pan,Agua,Leche,Harina,Mantequilla,Arroz";
		//crear una nueva cadena de caracteres que contenga los productos que empiece por A
		
		String[] datos = productos.split(",");
		
		StringBuilder resultado=new StringBuilder();
		for (String p:datos) {
			if(p.startsWith("A")){
				resultado.append(p);
				resultado.append(",");
			}
		}
		
		System.out.println(resultado);
	}

}
