
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sentencia if
		int valor = 2;
		
		if(valor > 0)
		{
			System.out.println("El valor es positivo");		
		}
		
		System.out.println("Ejemplo If Else");
		
		if(valor < 0)
		{
			System.out.println("El valor es negativo");			
			System.out.println("El valor es negativo");			
			System.out.println("El valor es negativo");			
		}
		else
		{
			System.out.println("+++++++++");
			System.out.println("El valor es positivo");			
			System.out.println("+++++++++");
		}
		
		if(valor < 0)
		{
			System.out.println("El valor es negativo");
		}
		else if(valor == 0)
		{
			System.out.println("El valor es cero");
		}
		else
		{
			System.out.println("El valor es positivo");
		}
		
		// Ejercicio, preguntar al usuario la edad y definir si es 
		// niño, adolescente, adulto o 3ra edad
		// Ver solución en Principal2
		
		
		boolean existe = false;
		if(existe)		
			System.out.println("======>  Si existe");
		else
			System.out.println("======>  No existe");
			
		
		int valor2 = 10;
		boolean esPositivo = false;
		String resultado = "";
		
		esPositivo = valor2 > 0 ? true : false;		
		resultado = valor2 >= 0 ? "Si" : "No";
		
		System.out.println("Es positivo: " + esPositivo);
		System.out.println("Es positivo: " + resultado);
		
		esPositivo = valor2 > 0;

		System.out.println("Es positivo: " + esPositivo);
		
	}

}
