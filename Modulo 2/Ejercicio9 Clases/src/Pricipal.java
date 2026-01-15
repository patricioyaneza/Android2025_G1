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
		
		
	}

}
