package logica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestCiudadesService {
	 static CiudadesService service = new CiudadesService();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		service.guardarCiudad("Madrid", 350000, "España");
		service.guardarCiudad("Sevilla", 3500000, "España");
		service.guardarCiudad("Paris", 500000, "Francia");
		service.guardarCiudad("Bruselas", 20000, "Belgica");
		service.guardarCiudad("Barcelona", 7630000, "España");
	}

	@Test
	void testGuardarCiudad() {
		//fail("Not yet implemented");
	}

	@Test
	void testCiudadesPorPais() {
		assertEquals(3, service.ciudadesPorPais("España").size());
	}

	@Test
	void testCiudadMasPoblada() {
		assertEquals("Paris", service.ciudadMasPoblada().getNombre());
	}

	@Test
	void testEliminarCiudad() {
		//fail("Not yet implemented");
	}

}
