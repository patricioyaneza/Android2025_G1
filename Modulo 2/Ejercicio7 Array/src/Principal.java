
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Arreglos / array
		
		int numero = 10;
		
		// crear arreglos
		int [] numeros = {1,5,3,7,6,0,100};		
		int [] numeros2 = new int[5];
		
		// asignar valor a un arreglo. indice 0
		numeros2[0] = 100;
		
		numeros2[4] = 500;
		// numeros2[5] = 500; // da error por estar fuera del limite del array
		
		System.out.println(numeros2[4]);
		numeros2[4] = 1500;
		System.out.println(numeros2[4]);
		
		System.out.println("Cant de elementos: " + numeros.length);
		
		int [][] matriz = { {1,2,3}, {9,8,7}};
		
		System.out.println("Matriz: " + matriz[1][0]);
		
		/*
		 * Crear un arreglo para 5 nombres
		 * solicitar al usuario ingresarlos
		 * guardar en el arreglo, todos en mayusculas
		 * 
		 * 
		 */
		
		
		
	}

}
