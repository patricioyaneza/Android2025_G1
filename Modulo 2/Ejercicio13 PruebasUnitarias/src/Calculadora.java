
public class Calculadora {
	private int valor1;
	private int valor2;
	private double resultado;
	public int getValor1() {
		return valor1;
	}
	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}
	public int getValor2() {
		return valor2;
	}
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}	
	
	public int sumar()
	{
		return this.valor1+this.valor2;
	}
	public int restar()
	{
		return this.valor1-this.valor2;
	}
	public int multiplicar()
	{
		return this.valor1+this.valor2;
	}
	public double dividir()
	{
		if(this.valor2 == 0)
			return -1;
		if(this.valor1 == 0)
			return 0;
		
		return this.valor1/this.valor2;
	}
}
