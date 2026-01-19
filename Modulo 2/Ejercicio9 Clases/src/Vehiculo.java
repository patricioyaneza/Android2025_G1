// esta clase representará una entidad u objeto real
public class Vehiculo {

	// atributos  encapsular
	private String patente; // AS7840    JGGG45
	private String marca;
	private String color;

//	int puertas;private 
//	int precioCosto;
//	int precioVenta;
	// ...
	
	// constructores
	public Vehiculo()  // new Vehiculo();
	{
		this.patente = "";
		this.marca   = "";
		this.color   = "";
	}
	public Vehiculo(String patente, String marca, String color) // new Vehiculo("rfsf","dfgs","rojo");
	{
		this.patente = patente;
		this.marca = marca;
		this.color = color;
	}
	
	
	// getter and setter  // accesador / mutador	
	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

	
	
	// metodos personalizado (customer)
	// private // no se puede acceder cuando se presiona el punto (objeto) 
	public void imprimir()
	{
		System.out.println("\n======== Datos del Automóvil ========");
		System.out.println("Patente : " + this.patente);
		System.out.println("Marca   : " + this.marca);
		System.out.println("Color   : " + this.color);		
	}
	
}
