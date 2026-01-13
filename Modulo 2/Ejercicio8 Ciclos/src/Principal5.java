import java.util.Scanner;

public class Principal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int opcion = -1;
		while(opcion != 0)
		{
			System.out.println("***** Menú *****");
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("0.- Salir");
			System.out.print("Seleccione la opción: ");
			opcion = leer.nextInt();
			
			if(opcion == 0)
				break;
			
			if(opcion == 1)
			{
				System.out.println("===== Sumar ======");
				
				
			}
			else if(opcion == 2)
			{
				System.out.println("===== Restar ======");
			}
			System.out.println("Presione C y enter para continuar...");
			leer.next();
		}
		
		System.out.println("________ Fin de la aplicación_________");
	}

}
