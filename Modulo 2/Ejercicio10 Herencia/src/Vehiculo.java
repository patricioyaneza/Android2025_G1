// super clase
// definir todo lo que sea general para que pueda ser heredado

public class Vehiculo { 
	// atributos
	private String patente;
	private String marca;
	private String modelo;
	
	
	// constructores
	public Vehiculo()
	{
		this.patente = "";
		this.marca = "";
		this.modelo = "";
	}

	public Vehiculo(String patente, String marca, String modelo) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
	}

	// Getter and Setter
	
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// metodos personalizados	
	
	public String imprimir() {
		return "Vehiculo [patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
		
}
