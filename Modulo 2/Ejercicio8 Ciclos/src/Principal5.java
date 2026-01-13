import java.util.Scanner;

public class Principal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int resultado = 0;
		int opcion = -1;
		while(opcion != 0)
		{
			System.out.println("***** Menú *****");
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("0.- Salir");
			System.out.print("Seleccione la opción: ");
			opcion = leer.nextInt();
			
			// validar que este dentro del rango del menu
			if(opcion < 0 || opcion > 2)
			{
				System.out.println("**********************************");
				System.out.println("La opción no es válida");
				System.out.println("Presione enter para continuar");
				System.out.println("**********************************");
				leer.nextLine();
				leer.nextLine();
				continue;
			}
			
			if(opcion == 0)
				break;		
/*
 * Ejercicio 15:
 *  Solicitar 2 numeros y sumar o restar de acuerdo a lo que el 
 *  usuario seleccionó
 * 	
 * 
 * Ejercicio 16:
 * agregar multiplicación y división.   
 */
			System.out.println("Ingrese primer número");
			num1 = leer.nextInt();

			System.out.println("Ingrese segundo número");
			num2 = leer.nextInt();
			
			if(opcion == 1)
			{
				System.out.println("===== Sumar ======");
				resultado = num1 + num2;				
			}
			else if(opcion == 2)
			{
				System.out.println("===== Restar ======");
				resultado = num1 - num2;				
			}
			
			System.out.println("El resultado es: " + resultado);	
			System.out.println("Presione enter para continuar...");
			leer.nextLine();
			leer.nextLine();
		}
		
		System.out.println("________ Fin de la aplicación_________");
	}

}
