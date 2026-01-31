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
	
	@Test
	void mostrarValoresPositivos() {
		c.setValor1(7);
		c.setValor2(3);
		String valores = c.mostrar();
		assertEquals("Valor 1: 7 Valor 2: 3", valores, "El string mostrado no es correcto para valores positivos");
	}
	
	@Test
	void mostrarValoresNegativos() {
		c.setValor1(-8);
		c.setValor2(-4);
		String valores = c.mostrar();
		assertEquals("Valor 1: -8 Valor 2: -4", valores, "El string mostrado no es correcto para valores negativos");
	}
	
	@Test
	void mostrarValoresCero() {
		c.setValor1(0);
		c.setValor2(0);
		String valores = c.mostrar();
		assertEquals("Valor 1: 0 Valor 2: 0", valores, "El string mostrado no es correcto para valores cero");
	}
	
	@Test
	void mostrarValoresMixtos() {
		c.setValor1(5);
		c.setValor2(-3);
		String valores = c.mostrar();
		assertEquals("Valor 1: 5 Valor 2: -3", valores, "El string mostrado no es correcto para valores mixtos");
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
	@Test
	void restarResultadoInCorrecto() {
		c.setValor1(10);
		c.setValor2(5);
		double resultado = c.restar();
		assertNotEquals(0, resultado, "La resta no debe ser 0");
	}
	@Test
	void restarConNegativos() {
		c.setValor1(-10);
		c.setValor2(-5);
		double resultado = c.restar();
		assertEquals(-5, resultado, "La resta con negativos no es correcta");
	}
	@Test
	void restarCero() {
		c.setValor1(0);
		c.setValor2(5);
		double resultado = c.restar();
		assertEquals(-5, resultado, "La resta con cero no es correcta");
	}
	@Test
	void restarCeroAmbos() {
		c.setValor1(0);
		c.setValor2(0);
		double resultado = c.restar();
		assertEquals(0, resultado, "La resta de cero y cero no es correcta");
	}
	
	@Test
	void restarPrimerNumeroNegativo() {
		c.setValor1(-10);
		c.setValor2(5);
		double resultado = c.restar();
		assertEquals(-15, resultado, "La resta con el primer numero negativo no es correcta");
	}
	
	@Test
	void multiplicarResultadoCorrecto() {
		c.setValor1(10);
		c.setValor2(5);
		double resultado = c.multiplicar();
		assertEquals(50, resultado, "La multiplicacion no es correcta");
	}
	@Test
	void multiplicarResultadoInCorrecto() {
		c.setValor1(10);
		c.setValor2(5);
		double resultado = c.multiplicar();
		assertNotEquals(0, resultado, "La multiplicacion no debe ser 0");
	}
	@Test
	void multiplicarConNegativos() {
		c.setValor1(-10);
		c.setValor2(-5);
		double resultado = c.multiplicar();
		assertEquals(50, resultado, "La multiplicacion con negativos no es correcta" + resultado);
	}
	@Test
	void multiplicarCero() {
		c.setValor1(0);
		c.setValor2(5);
		double resultado = c.multiplicar();
		assertEquals(0, resultado, "La multiplicacion con cero no es correcta");
	}
	@Test
	void multiplicarCeroAmbos() {
		c.setValor1(0);
		c.setValor2(0);
		double resultado = c.multiplicar();
		assertEquals(0, resultado, "La multiplicacion de cero y cero no es correcta");
	}
	
	@Test
	void dividirResultadoCorrecto() {
		c.setValor1(10);
		c.setValor2(5);
		double resultado = c.dividir();
		assertEquals(2, resultado, "La division no es correcta");
	}

	@Test
	void dividirPorCero() {
		c.setValor1(10);
		c.setValor2(0);
		double resultado = c.dividir();
		assertEquals(-1, resultado, "La division por cero no devuelve -1");
	}
	@Test
	void dividirDivisorEsCero() {
		c.setValor1(0);
		c.setValor2(5);
		double resultado = c.dividir();
		assertEquals(0, resultado, "Cero entre un numero no devuelve 0");
	}
	@Test
	void dividirConNegativos() {
		c.setValor1(-10);
		c.setValor2(-5);
		double resultado = c.dividir();
		assertEquals(2, resultado, "La division con negativos no es correcta");
	}
	@Test
	void dividirDivisorNegativo() {
		c.setValor1(10);
		c.setValor2(-5);
		double resultado = c.dividir();
		assertEquals(-2, resultado, "La division con divisor negativo no es correcta");
	}
	@Test
	void dividirDividendoNegativo() {
		c.setValor1(-10);
		c.setValor2(5);
		double resultado = c.dividir();
		assertEquals(-2, resultado, "La division con dividendo negativo no es correcta");
	}
	
	@Test
	void sumarValoresNegativos() {
		c.setValor1(-4);
		c.setValor2(-6);
		int resultado = c.sumar();
		assertEquals(-10, resultado, "La suma de dos negativos no es correcta");
	}
	
	@Test
	void sumarPositivoNegativo() {
		c.setValor1(8);
		c.setValor2(-3);
		int resultado = c.sumar();
		assertEquals(5, resultado, "La suma de un positivo y un negativo no es correcta");
	}
	
	@Test
	void sumarAmbosCero() {
		c.setValor1(0);
		c.setValor2(0);
		int resultado = c.sumar();
		assertEquals(0, resultado, "La suma de dos ceros debe ser 0");
	}
	
	@Test
	void sumarUnValorCero() {
		c.setValor1(0);
		c.setValor2(7);
		int resultado = c.sumar();
		assertEquals(7, resultado, "La suma de cero y un positivo no es correcta");
		c.setValor1(5);
		c.setValor2(0);
		resultado = c.sumar();
		assertEquals(5, resultado, "La suma de un positivo y cero no es correcta");
	}
}