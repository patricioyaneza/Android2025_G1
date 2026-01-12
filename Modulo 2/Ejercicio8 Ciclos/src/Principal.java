
public class Principal {
// dar el punto de inicio a nuestra app
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for while 
		for(int i = 1; i <= 10; i++)
		{
			i++;
			System.out.println("El numero es: " + i);
		}
		
		System.out.println("============> \n\n\n");
		
		int[] numeros = {324,523,45,2345,2343,234,523,4523,452,345,234,523,45243};
		
		// ????
		for(int indice = 0; indice < numeros.length; indice++)
		{
			System.out.println("Valor " + (indice+1) + ": "+  numeros[indice]);
		}
		
		
		System.out.println("Fin de la aplicación");
	}

}
