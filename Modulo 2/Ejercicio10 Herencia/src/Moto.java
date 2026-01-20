// sub clase
// Se define todo lo especifico de la entidad a describir
// se hereda lo public y protected
public class Moto extends Vehiculo{
	// atributos
	private int medidaManillar;
	private String estilo; // chopper, enduro, racer, cross ==> solo se vende
	
	// constructores
	public Moto() // Que pasa con el constructor???
	{
		this.medidaManillar = 0;
		this.estilo = "";
	}

	
	// g & s
	public int getMedidaManillar() {
		return medidaManillar;
	}

	public void setMedidaManillar(int medidaManillar) {
		this.medidaManillar = medidaManillar;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	public String imprimir() {
		// return super.imprimir();
		
		String respuesta =  "\nPatente         : " + getPatente() +
							"\nMarca           : " + getMarca() +
							"\nModelo          : " + getModelo() +				
							"\nMedida Manillar : " + this.medidaManillar + 
							"\nEstilo          : " + this.estilo;
		return respuesta;
		
	}
	
	
	
	
	
	
}
