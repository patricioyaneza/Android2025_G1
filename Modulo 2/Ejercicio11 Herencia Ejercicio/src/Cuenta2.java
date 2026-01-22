public class Cuenta2 {
	private int numeroCuenta;
	private String titular;
	private double saldo;

	public Cuenta2() // new Cuenta2();
	{
		this.numeroCuenta = 0;
		this.titular = "";
		this.saldo = 0;
	}
	
	public Cuenta2(int numeroCuenta, String titular, double saldo)
	{
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
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

