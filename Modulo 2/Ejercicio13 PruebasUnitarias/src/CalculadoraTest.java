import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	private Calculadora c;
	
	@BeforeEach
	void configuracion()
	{
		c = new Calculadora();		 
		c.setValor1(1);
		c.setValor2(2);
	}
	
	@Test
	void sumarResultadoCorrecto() {
		int resultado = c.sumar();
		System.out.println("sumarResultadoCorrecto: " + resultado);
		assertEquals(3, resultado);
	}

	@Test
	void sumarResultadoInCorrecto() {
		int resultado = c.sumar();
		System.out.println("sumarResultadoInCorrecto: " + resultado);
		assertNotEquals(0, resultado);
	}
	
	// Ejercicio 25:
	/*
	 * Crear 2 pruebas para restar, multiplicar
	 * crear 3 pruebas para el metodo dividir
	 * 
	 */
}
