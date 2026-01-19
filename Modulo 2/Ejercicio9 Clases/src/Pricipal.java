import java.util.Scanner;

public class Pricipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**** Automotora Android ****");
		Scanner leer = new Scanner(System.in);
		String patente;
		String marca;
		String color;
		
		System.out.print("Ingrese patente: ");
		patente = leer.next();
		System.out.print("Ingrese marca: ");
		marca = leer.next();
		System.out.print("Ingrese color: ");
		color = leer.next();

		Vehiculo vehiculo1 = new Vehiculo(patente, marca, color);		
		Vehiculo vehiculo2 = new Vehiculo("as7010", "Fiat", "Rojo");
		
		vehiculo1.imprimir();
		vehiculo2.imprimir();
		
		
		// Colecciones:  ArrayList
		
		Vehiculo vehiculo3 = new Vehiculo();
		vehiculo3.imprimir();
		vehiculo3.setPatente("KPLT40"); // set para modificar el valor actual del atributo
		vehiculo3.setMarca("BWM");
		vehiculo3.setColor("Blanco");
		vehiculo3.imprimir();
		
		vehiculo2.setPatente("AF7010");
		vehiculo2.imprimir();
		
		System.out.println("\nBúsqueda de la patente: KPLT40" );
		System.out.println("La marca del vehiculo es: " + vehiculo3.getMarca());
		
	}
/* Ejercicio 20:
 * 
 * Agregar a la clase Cuenta getter and setter y encapsular 
 * Agregar contructor sin parametros
 * 
 * Crear un objeto sin parametro
 * modificar datos del obj
 * 
 */
}
