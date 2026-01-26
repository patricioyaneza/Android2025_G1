public class Cuenta {
	private int numeroCuenta;
	private String titular;
	protected double saldo;

	public Cuenta() // new Cuenta2();
	{
		this.numeroCuenta = 0;
		this.titular = "";
		this.saldo = 0;
	}
	
	public Cuenta(int numeroCuenta, String titular, double saldo)
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
		System.out.println("Número Cuenta : " + this.numeroCuenta);
		System.out.println("Titular       : " + this.titular);
		System.out.println("Saldo         : " + this.saldo);
	}
	
	public void depositar(int monto)
	{
		this.saldo = this.saldo + monto;
	}
	public void retirar(int monto)
	{
		if(this.saldo >= monto)
			this.saldo = this.saldo - monto;
		else
			System.out.println("No tiene saldo sufieciente.");
	}
}

