
public class Principal8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if con más de 1 condición 
		
		int nota = 20;
		
		if(nota < 10 || nota > 70)
		{
			System.out.println("La nota no es válida.");
		}
		else
		{
			System.out.println("La nota es valida.");
		}
		
		String usuario = "diego";
		String clave = "1234A";
		

		if(usuario.equals("diego") && clave == "1234a") {
			System.out.println("Acceso permitido");
		}
		else
			System.out.println("Acceso denegado");
		
		// Ejercicio 8:
		/*
		 * Solicitar 3 notas promediarlos y señalar si aprobó o no.
		 * Adicionalmente si la nota es superior a 30 y solo tiene 1 rojo
		 * señalar que puede dar un examen de repechaje
		 * 
		 * 	si promedio igual o superior a 40 aprueba
		 *  20 40 30  -> sin examen
		 *  10 50 40  -> puede dar el examen
		 */
		
	}

}
