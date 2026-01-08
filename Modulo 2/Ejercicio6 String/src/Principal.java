
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = " Juan ";
		
		System.out.println("Contar caracteres: " + nombre.length()); // len
		
		System.out.println("Mayúscula: " + nombre.toUpperCase()); // upper toUpper
		System.out.println("minúscula: " + nombre.toLowerCase());
		
		System.out.println("valor :" + nombre + ".");
		System.out.println("valor :" + nombre.trim() + ".");
    	
		System.out.println("1er parrafo \n2do parrafo \n3er parrafo");
		
		String frase = "Estoy cansado jefe.";
		System.out.println("indexOf		: " + frase.indexOf("jefe"));
		System.out.println("indexOf		: " + frase.indexOf("a"));
		System.out.println("lastIndexOf	: " + frase.lastIndexOf("a"));
		System.out.println("charAt		: " + frase.charAt(4));
		
		System.out.println("SubString	: " + frase.substring(6));
		System.out.println("SubString	: " + frase.substring(6, 13) + ".");
		
		/* Ejercicio 9:
		 * 
		 * Ingrese un rut con digito verificador y muestre solo el numero
		 * o sea, sin guion ni digito verificador
		 * 20100300-5  => 20100300
		 *  9200350-7  =>  9200350
		 */
		
		
	}

}
