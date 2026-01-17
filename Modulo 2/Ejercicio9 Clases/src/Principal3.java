import java.util.Scanner;

public class Principal3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("**** Cuenta 1 ****");
		Scanner leer = new Scanner(System.in);
		int numeroCuenta;
		String titular;
		double saldo;

		System.out.println("\n===== Ingrese datos de la cuenta =====");
		System.out.println("ingrese numero de cuenta: ");
		numeroCuenta = leer.nextInt();
		System.out.println("ingrese nombre titular: ");
		titular = leer.next();
		System.out.println("ingrese saldo cuenta: ");
		saldo = leer.nextDouble();

		Cuenta cuenta = new Cuenta(numeroCuenta, titular, saldo);
/*
 * utilizar sin parametros y setter
 * 
 */
		cuenta.imprimir();

		}
}
