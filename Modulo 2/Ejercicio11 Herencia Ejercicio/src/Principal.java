import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		System.out.println("**** Cuenta 1 ****");
		Scanner leer = new Scanner(System.in);
		int numeroCuenta;
		String titular;
		double saldo;

		System.out.println("\n===== Ingrese datos de la cuenta =====");
		System.out.println("ingrese numero de cuenta: ");
		numeroCuenta = leer.nextInt();
		System.out.println("ingrese nombre titular: ");
		titular = leer.nextLine();
		titular = leer.nextLine();
		System.out.println("ingrese saldo cuenta: ");
		saldo = leer.nextDouble();
/*   la cuenta siempre esta en pesos */
		Cuenta cuenta = new Cuenta();
		cuenta.setNumeroCuenta(numeroCuenta);
		cuenta.setTitular(titular);
		cuenta.setSaldo(saldo);
		cuenta.imprimir();

// inteface // prueba unitarias. // revis	
		
	}

}
