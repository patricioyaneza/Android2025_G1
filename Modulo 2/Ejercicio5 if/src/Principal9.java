
		import java.util.Scanner;
public class Principal9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int nota1;
		int nota2;
		int nota3;
		int cantidadRojos = 0;


		System.out.print("INGRESE PRIMERA NOTA: ");
		nota1 = scan.nextInt();
		if (nota1 < 40) cantidadRojos++;

		System.out.print("INGRESE SEGUNDA NOTA: ");
		nota2 = scan.nextInt();
		if (nota2 < 40) cantidadRojos++;

		System.out.print("INGRESE TERCERA NOTA: ");
		nota3 = scan.nextInt();
		if (nota3 < 40) cantidadRojos++;


		int promedio = (nota1 + nota2 + nota3) / 3;

		if (promedio >= 40){
			System.out.println("Tu promedio es : " + promedio);
			System.out.print("APROBASTE");
		}
		else if (promedio >= 30 && cantidadRojos == 1){
			System.out.println("Tu promedio es : " + promedio);
			System.out.print("TIENES DERECHO A LA PRUEBA DE REPECHAJE");
		}
		else
		{ 
			System.out.println("Tu promedio es : " + promedio);
			System.out.print("REPROBASTE");
		}
	}

}
