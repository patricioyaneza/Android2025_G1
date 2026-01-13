
public class Principal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// while
		int numero = 0;
		while(numero++ < 10)
		{
			System.out.println("Valor actual: " + numero);
		}
		
		// Break
		System.out.println("\n\n\n======>>> Break");
		numero = 0;
		while(numero++ < 10)
		{
			if(numero == 6)
				break;
			System.out.println("Valor actual: " + numero);
		}
		
		// continuar  continue  kənˈtinyo͞o
		
		System.out.println("\n\n\n======>>> continue");
		numero = 0;
		while(numero++ < 1000)
		{
			if(numero%2 != 0) // el numero es impar
				continue;
			
			System.out.println("Valor par: " + numero);
		}
		
		System.out.println("Fin de la aplicación");
		
	}

}
