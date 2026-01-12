import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Ejercicio 16:
			Solicitar al usuario la cantidad de notas a ingresarlas. 
			Obtener promedio y mostrar si aprobo o no.
			Usar arreglos para guardar las notas.
		*/
		/*
		 *  1.- Pedir la cantidad de notas y crear arreglo
		 *  2.- Solicitar las notas (for)
		 *  3.- Sumar (for)
		 *  4.- Mostrar el promedio de notas
		 *   
		 */
		Scanner scan = new Scanner(System.in);


		System.out.print("CUANTAS NOTAS NECESITA PROMEDIAR: ");
		int cantNotas = scan.nextInt();

		double [] notas = new double[cantNotas];
		double suma = 0;

		for (int i = 0; i < cantNotas; i++) {
			System.out.print("Ingrese Nota " + (i + 1) + ":" ) ;
			notas[i] = scan.nextDouble();
			suma += notas[i];
		}

		double promedio = suma / cantNotas;
		System.out.println("Tu promedio es: " + promedio);

		if (promedio >= 4.0) 
			System.out.println("Aprobaste");
		else
			System.out.println("Reprobaste");

	}

}
