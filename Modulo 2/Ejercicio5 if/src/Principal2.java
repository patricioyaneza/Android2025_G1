import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

		System.out.print("Ingresa tu edad: ");
		int edad = leer.nextInt();

		if (edad < 0) {
			System.out.println("Edad inválida.");
		} else if (edad < 12) {
			System.out.println("Eres niño.");
		} else if (edad <= 17) {
			System.out.println("Eres adolescente.");
		} else if (edad <= 59) {
			System.out.println("Eres adulto.");
		} else {
			System.out.println("Eres de tercera edad.");
		}

	}

}
