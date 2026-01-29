import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String respuesta = "";
		
		Animal animal = new Animal();
		respuesta = animal.emitirSonido();
		System.out.println("Sonido del animal: " + respuesta );
		
		Animal animal2 = new Perro();
		respuesta = animal2.emitirSonido(); // polimorfismo
		System.out.println("Sonido del perro: " + respuesta );
		
		// mini ejercicio: convertir a perro el obj de animal2
		Perro perrito = (Perro)animal2;
		perrito.saludar(); // (int)0.1;
		
		Animal animal3 = new Gato();
		respuesta = animal3.emitirSonido(); // polimorfismo
		System.out.println("Sonido del gato: " + respuesta );
		
		ArrayList<Animal> animales = new ArrayList<Animal>(); 
//		var animales2 = new ArrayList<Animal>();
//		final ArrayList<Animal> animales = new ArrayList<Animal>();
		
		animales.add(animal);
		animales.add(animal2);
		animales.add(animal3);
		animales.add(new Perro());
		animales.add(new Gato());
		
		Animal a1 = animales.get(0);
		System.out.println(a1.comer());
		
		System.out.println(animales.get(1).comer());
		System.out.println("\n\nRecorrer la colección");
		for(Animal aux: animales) // for each
		{
			System.out.println(aux.emitirSonido());
		}
		
	}

}
