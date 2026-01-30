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

	@Test
	void mostrarValores() {
		c.setValor1(10);
		c.setValor2(5);
		String valores = c.mostrar();
		System.out.println("mostrarValores: " + valores);
		assertEquals("Valor 1: 10 Valor 2: 5", valores, "Los valores mostrados no son correctos");
	}
	
	// Ejercicio 25:
	/*
	 * Crear 4 pruebas para restar, multiplicar
	 * crear 5 pruebas para el metodo dividir
	 * 
	 */
	@Test
	void restarResultadoCorrecto() {
		c.setValor1(10);
		c.setValor2(5);
		double resultado = c.restar();
		assertEquals(5, resultado, "La resta no es correcta");
	}
	
	
	
	
	
	
	
}
