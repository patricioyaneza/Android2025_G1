import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ejercicio 9:
		 * 
		 * 1.- Ingrese un rut con digito verificador y muestre solo el numero
		 * o sea, sin guion ni digito verificador
		 * 20100300-5  => 20100300
		 *  9200350-7  =>  9200350
		 *  
		 *  2.- Aparte, mostrar el digito verificador
		 *  9200350-7  => 7
		 */
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese RUT (con guion y DV): ");
		String rutCompleto = teclado.nextLine();

		// Buscamos la posición del guion
		int posicionGuion = rutCompleto.indexOf("-");

		if (posicionGuion != -1) {
			String cuerpoRut = rutCompleto.substring(0, posicionGuion);
			char dv = rutCompleto.charAt(rutCompleto.length()-1);
			String dv1 = rutCompleto.substring(rutCompleto.length()-1);
			System.out.println("Cuerpo del RUT		: " + cuerpoRut);
			System.out.println("Dígito Verificador	: " + dv);
			System.out.println("Dígito Verificador	: " + dv1);
		} else {
			System.out.println("Error: El RUT no contiene guion.");
		}
		
	}

}
