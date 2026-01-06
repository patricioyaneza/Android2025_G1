import java.util.Scanner;

public class Principal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio:
		// Simular un login de usuario y permitir acceso a la aplicación
		// si las credenciales corresponde
		// 2 variables (usuario y clave) 
		// 1ro evaluar si nombre usuario existe y despues si la clave es correcta
		
		String nombreUsuario = "Ana";
		String claveUsuario = "1234";
		
		String nombre = "";
		String clave = "";
		Scanner leer = new Scanner(System.in);
		
		System.out.println("══════════════ Super Aplicación ═══════════════");
		System.out.print("Ingrese su nombre de usuario: ");
		nombre = leer.next();
		
		//if(nombre.equals(nombreUsuario))
		if(nombre.equalsIgnoreCase(nombreUsuario))
		{
			System.out.print("Ingrese su clave: ");
			clave = leer.next();
			if(clave.equals(claveUsuario)) // toLowerCase()   toUpperCase()
			{
				System.out.println("Bienvenido(a) " + nombre);				
			}
			else
				System.out.println("La Clave no coincide.");
		}
		else
		{
			System.out.println("No existe el  nombre de usuario.");
		}
		
	}

}
