
public class Cuenta {
	
	int numeroCuenta;
	String titular;
	double saldo;

	public Cuenta(int numeroCuenta, String titular, double saldo)
	{
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}


	public void imprimir()
	{
		System.out.println("Datos de la cuenta");
		System.out.println("numeroCuenta: " + this.numeroCuenta);
		System.out.println("titular: " + this.titular);
		System.out.println("saldo: " + this.saldo);
	}
}
