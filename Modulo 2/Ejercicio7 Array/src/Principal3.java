import java.util.Arrays;
import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  para cada nombre (5) guardar en una matriz el nombre y el
		 *  apellido
		 * 
		 *  ana  ==>  perez
		 *  ignacia ==> Diaz
		 *  
		 *  mostrar el nombre y el apellido guardo en la matriz de forma
		 *  ordenada
		 *  
		 */
		Scanner scan = new Scanner(System.in);

		// define matriz de 5 x 2   
		String [][] nombres = new String[5][2];

		System.out.print("INGRESE EL PRIMER NOMBRE: ");
		nombres[0][0] = scan.next().toUpperCase();
		System.out.print("INGRESE EL SEGUNDO NOMBRE: ");
		nombres[1][0] = scan.next().toUpperCase();
		System.out.print("INGRESE EL TERCERO NOMBRE: ");
		nombres[2][0] = scan.next().toUpperCase();
		System.out.print("INGRESE EL CUARTO NOMBRE: ");
		nombres[3][0] = scan.next().toUpperCase();
		System.out.print("INGRESE EL QUINTO NOMBRE: ");
		nombres[4][0] = scan.next().toUpperCase();

		System.out.print("INGRESE EL PRIMER APELLIDO: ");
		nombres[0][1] = scan.next().toUpperCase();
		System.out.print("INGRESE EL SEGUNDO APELLIDO: ");
		nombres[1][1] = scan.next().toUpperCase();
		System.out.print("INGRESE EL TERCERO APELLIDO: ");
		nombres[2][1] = scan.next().toUpperCase();
		System.out.print("INGRESE EL CUARTO APELLIDO: ");
		nombres[3][1] = scan.next().toUpperCase();
		System.out.print("INGRESE EL QUINTO APELLIDO: ");
		nombres[4][1] = scan.next().toUpperCase();

// permite ordenar segun el indice señalado. (Se ordenara por nombre)
		Arrays.sort(nombres, (a, b) -> a[0].compareTo(b[0]));
		
		System.out.println("Nombre completo: " + nombres[0][0] +" "+ nombres[0][1]);
		System.out.println("Nombre completo: " + nombres[1][0] +" "+ nombres[1][1]);
		System.out.println("Nombre completo: " + nombres[2][0] +" "+ nombres[2][1]);
		System.out.println("Nombre completo: " + nombres[3][0] +" "+ nombres[3][1]);
		System.out.println("Nombre completo: " + nombres[4][0] +" "+ nombres[4][1]);
		
		
	}

}
