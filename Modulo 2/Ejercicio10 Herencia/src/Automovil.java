
public class Automovil extends Vehiculo {

	// Atributos propios de automovil
	private boolean aireAcondicionado;
	private int cantidadPuertas;

	// Constructores
	public Automovil() { // new Automovil();
		super(); // invoca el constructor SIN parametros. 
		this.aireAcondicionado = true;
		this.cantidadPuertas = 3;
	}
	public Automovil(String patente, String marca, String modelo, boolean aireAcondicionado, int cantidadPuertas) { // new Automovil();
		super(patente, marca, modelo); // invoca el constructor con parametros de la super clase
		this.aireAcondicionado = true;
		this.cantidadPuertas = cantidadPuertas;
	}
	
	// Getter and Setter

	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	public int getCantidadPuertas() {
		return cantidadPuertas;
	}

	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}

	// Métodos personalizados
	@Override
	public String imprimir() {
		String respuesta =  "\nPatente             : " + getPatente() + 
							"\nMarca               : " + getMarca() + 
							"\nModelo              : " + getModelo() +
							"\nAire Acondicionado  : " + (this.aireAcondicionado?"Si":"No") + 
							"\nCantidad de puertas : " + this.cantidadPuertas;
		
		// mini ejercicio: cambiar el t/f por si/no
		return respuesta;
	}
}
