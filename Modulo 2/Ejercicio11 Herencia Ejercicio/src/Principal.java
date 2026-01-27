import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		System.out.println("**** Cuenta 1 ****");
		Scanner leer = new Scanner(System.in);
		int numeroCuenta;
		String titular;
		double saldo;

		System.out.println("\n===== Ingrese datos de la cuenta =====");
		System.out.print("ingrese numero de cuenta: ");
		numeroCuenta = leer.nextInt();
		System.out.print("ingrese nombre titular: ");
		titular = leer.nextLine();
		titular = leer.nextLine();
		System.out.print("ingrese saldo cuenta: ");
		saldo = leer.nextDouble();
/*   la cuenta siempre esta en pesos */
		
		
		/* 
		 // da error si la clase Cuenta es ABSTRACTA
		 
			Cuenta cuenta = new Cuenta();
			
			cuenta.setNumeroCuenta(numeroCuenta);
			cuenta.setTitular(titular);
			cuenta.setSaldo(saldo);
			cuenta.imprimir();
		 */
		
		CuentaUSD cuentaDolar = new CuentaUSD();
		cuentaDolar.setNumeroCuenta(9999);
		cuentaDolar.setTitular("Andrea");
		cuentaDolar.setSaldo(0);
		cuentaDolar.setValorDolar(862);
		cuentaDolar.depositar(100);// 25
		cuentaDolar.depositar(50); // 26
		cuentaDolar.imprimir();
		cuentaDolar.retirar(100);
		cuentaDolar.imprimir();
		
		cuentaDolar.enviarCartola();

// inteface // prueba unitarias. // revis	
		
	}

}
