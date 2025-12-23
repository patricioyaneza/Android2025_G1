import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double promedio = 0;		
			
		// permite leer el teclado
		Scanner leer = new Scanner(System.in);
		
		System.out.println("****** Promedio de Notas *******");
		System.out.println("Ingrese 1ra nota: ");
		nota1 = leer.nextDouble(); // captura lo que el usuario escribio
		System.out.println("Ingrese 2da nota: ");
		nota2 = leer.nextDouble();
		System.out.println("Ingrese 3ra nota: ");
		nota3 = leer.nextDouble();
		// suma las notas y lo divide por 3
		promedio = (nota1+nota2+nota3) / 3;
		System.out.println("El resultado es: " + promedio);
	}
}
