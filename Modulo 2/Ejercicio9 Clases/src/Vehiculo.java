// esta clase representará una entidad u objeto real
public class Vehiculo {

	// atributos
	String patente; // AS7840    JGGG45
	String marca;
	String color;
//	int puertas;
//	int precioCosto;
//	int precioVenta;
	// ...
	
	// constructores
	public Vehiculo(String patente, String marca, String color)
	{
		this.patente = patente;
		this.marca = marca;
		this.color = color;
	}
	
	// getter and setter 
	
	// metodos personalizado (customer)
	
	// private // no se puede acceder cuando se presiona el punto (objeto) 
	public void imprimir()
	{
		System.out.println("\n======== Datos del objeto ========");
		System.out.println("Patente : " + this.patente);
		System.out.println("Marca   : " + this.marca);
		System.out.println("Color   : " + this.color);
	}
	
}
