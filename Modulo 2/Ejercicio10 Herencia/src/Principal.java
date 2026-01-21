
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moto moto = new Moto();
		
		moto.setPatente("RTKL30");
		moto.setMarca("Honda");
		moto.setModelo("X30 super");
		moto.setEstilo("Cross");
		moto.setMedidaManillar(30);
		
		System.out.println("***** AutoMotora Auto Feliz 😊 *******");
		String infoVehiculo = moto.imprimir();
		System.out.println(infoVehiculo);
		
		System.out.println(new Moto().imprimir());
		
		
		/**
		 *  Ejercicio 24:
		 * Crear la clase Automovil Agregar 2 atributos adicionales
		 * (cuenta con aire acondicionado, cantidad de puertas) 
		 * Heredar de Vehiculo.
		 * Crear un objeto Automovil, asignar datos y mostrar en consola
		 * 
		 * 
		 */
		Automovil automovil = new Automovil();

		automovil.setPatente("MY4527");
		automovil.setMarca("Suzuki");
		automovil.setModelo("Swift");
		automovil.setAireAcondicionado(false);
		automovil.setCantidadPuertas(5);

		String infoVehiculo2 = automovil.imprimir();
		System.out.println(infoVehiculo2);

		Automovil automovil2 = new Automovil("TRPL45", "Peugeot", "208", true, 5);
		System.out.println(automovil2.imprimir());
		
	}

}
