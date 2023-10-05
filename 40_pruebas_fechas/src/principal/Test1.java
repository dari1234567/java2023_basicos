package principal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test1 {

	public static void main(String[] args) {
		Date d1=new Date();
		Date d2=new Date(2337484972321l);
		if(d1.before(d2)) {
			System.out.println("Fecha más antigua: "+d1);
			System.out.println("Fecha más moderna: "+d2);
		}else {
			System.out.println("Fecha más antigua: "+d2);
			System.out.println("Fecha más moderna: "+d1);
		}
		
		//formateado de fechas
		SimpleDateFormat fr=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(fr.format(d1));
		System.out.println(fr.format(d2));
		
		//formateado con localización
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault());
		System.out.println(df.format(d1));
		System.out.println(df.format(d2));
		
		//parseado de fechas
		String f="30-05-2022";
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date d3=sdf.parse(f);
			System.out.println(df.format(d3));
		}catch(ParseException ex) {
			ex.printStackTrace();
			System.out.println("cadena de fecha no válida");
		}
	}

}
