package PruebaBean;

import java.util.ArrayList;

import model.Alumno;

public class PruebaBean {

	public static void main(String[] args) {
		Alumno alumno = new Alumno("alumno1","java 21", 45);
		System.out.println("El alumno es del curso "+alumno.getCurso());
		alumno.setEdad(12);
		
		//se pueden crear colecciones y arrays de javabeans
		
		ArrayList<Alumno> alumnos = new ArrayList<>();
		alumnos.add(alumno);
	}

}
