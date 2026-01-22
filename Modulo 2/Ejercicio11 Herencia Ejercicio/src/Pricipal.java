import java.util.Scanner;

public class Pricipal {

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

		Cuenta2 cuenta2 = new Cuenta2();
		cuenta2.setNumeroCuenta(numeroCuenta);
		cuenta2.setTitular(titular);
		cuenta2.setSaldo(saldo);
		cuenta2.imprimir();

		
	}

}
