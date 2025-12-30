import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Establecer las variables
		double valor1 = 0;
		double valor2 = 0;
		double suma = 0;
		double resta = 0;
		double multiplicacion = 0;
		double division = 0;
		double num1 = 1;

		//scanner el teclado
		Scanner leer = new Scanner(System.in);

		//Ejecutas las funciones
		System.out.println("Ingrese primer valor: ");
		valor1 = leer.nextDouble();

		System.out.println("Ingrese segundo valor ");
		valor2 = leer.nextDouble();

		suma = valor1 + valor2;
		System.out.println("El resultado de la suma es: " + suma);

		resta = valor1 - valor2;
		System.out.println("El resultado de la resta es: " + resta);

		division = valor1 / valor2;
		System.out.println("El resultado de la división es: " + division);

		multiplicacion = valor1 * valor2;
		System.out.println("El resultado de la multiplicación es: " + multiplicacion);

		num1++;
		System.out.println("El valor de num1 aumentado es: " + num1);

		leer.close();

	}

}
