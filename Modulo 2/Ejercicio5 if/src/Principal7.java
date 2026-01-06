import java.util.Scanner;

public class Principal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		EJERICICIO 6:

		Para una empresa de domotica, se requiere encender artefactos disponibles en la empresa.
		Los dispositivos disponibles son: OF1, OF2, OF3, MAQUINA1, MAQUINA2 y VENTILADORES
		La aplicacion debe solicitar el nombre del dispositivo o su numero ( de acuerdo a lo que permita switch)
		y "encender" el dispositivo solicitado.



		*/

		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese nombre de dispositivo a encender: ");
		String artefacto = entrada.nextLine();

		switch(artefacto.toUpperCase()) {
		case "OF1":
			System.out.println(artefacto + " ha sido encendido");
			break;
		case "OF2":
			System.out.println(artefacto + " ha sido encendido");
			break;
		case "OF3":
			System.out.println(artefacto + " ha sido encendido");
			break;
		case "MAQUINA1":
			System.out.println(artefacto + " ha sido encendido");
			break;
		case "MAQUINA2":
			System.out.println(artefacto + " ha sido encendido");
			break;
		case "VENTILADORES":
			System.out.println(artefacto + " ha sido encendido");
			break;
		default:
			System.out.println("No existe artefacto");

		}
		System.out.println("fin");

	}

}
