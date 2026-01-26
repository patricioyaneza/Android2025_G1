
public class CuentaUSD extends Cuenta {
	private double valorDolar;
	
	public CuentaUSD()
	{
		super();
		this.valorDolar = -1;		
	}
// Mini ejercicio: crear constructor con parametros
	
	public CuentaUSD(int numeroCuenta, String titular, double saldo, int valorDolar) {
		super(numeroCuenta, titular, saldo);
		this.valorDolar = valorDolar;
	}	
	
	public double getValorDolar() {
		return valorDolar;
	}


	public void setValorDolar(double valorDolar) {
		this.valorDolar = valorDolar;
	}

	@Override  // sobre escritura
	public void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir();
		System.out.println("Valor dolar   : " + this.valorDolar);
	}

	@Override
	public void depositar(int monto) {

		if(this.valorDolar < 0)
		{
			System.out.println("Falta el valor del dolar");
			return;
		}
		
		double totalPeso = monto * this.valorDolar;
		//super.depositar((int)totalPeso);
		this.saldo = this.saldo + totalPeso;
	}

	@Override
	public void retirar(int monto) {
		// TODO Auto-generated method stub
		if(this.valorDolar < 0)
		{
			System.out.println("Falta el valor del dolar");
			return;
		}
		
		double totalPeso = monto * this.valorDolar;
		super.retirar((int)totalPeso);
	}

	
	
}
