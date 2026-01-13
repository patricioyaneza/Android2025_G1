import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear una cuanta regresiva desde el valor que indique el usuario
		 * utilizar for para mostrar la cuenta regresiva
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese valor para comenzar la cuenta regresiva: ");
		int valor = sc.nextInt();

		for (int i = valor; i >= 0; i--) {
			System.out.println(i + "...");
		}
		System.out.print("Despegando----->>>>>>");
	}

}
