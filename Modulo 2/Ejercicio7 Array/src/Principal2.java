import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear un arreglo para 5 nombres
		 * solicitar al usuario ingresarlos
		 * guardar en el arreglo, todos en mayusculas
		 * 
		 * 
		 */
		Scanner teclado = new Scanner(System.in);
		String[] nombres = new String[5];
		System.out.print("Ingrese 1er nombre:");
		nombres[0] = teclado.nextLine().toUpperCase();
		System.out.print("Ingrese 2do nombre:");
		nombres[1] = teclado.nextLine().toUpperCase();
		System.out.print("Ingrese 3ro nombre:");
		nombres[2] = teclado.nextLine().toUpperCase();
		System.out.print("Ingrese 4to nombre:");
		nombres[3] = teclado.nextLine().toUpperCase();
		System.out.print("Ingrese 5to nombre:");
		nombres[4] = teclado.nextLine().toUpperCase();
		
		System.out.println("El resultado es:");
		System.out.println("==> 1: " + nombres[0]);
		System.out.println("==> 2: " + nombres[1]);
		System.out.println("==> 3: " + nombres[2]);
		System.out.println("==> 4: " + nombres[3]);
		System.out.println("==> 5: " + nombres[4]);
		
		/*
		 *  para cada nombre guardar en otro arreglo el
		 *  apellido
		 * 
		 *  ana  ==>  perez
		 *  ignacia ==> Diaz
		 *  
		 *  mostrar el nombre y el apellido guardo en cada arreglo
		 *  
		 */
	}

}
