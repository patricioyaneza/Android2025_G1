
public class Perro extends Animal {

	@Override
	public String comer() {
		return "El perro come";
	}

	@Override
	public String dormir() {
		return "El perro duerme";
	}

	@Override
	public String emitirSonido() {
		return "GaUUuuUUUuu!!!";
	}

	public void saludar()
	{
		System.out.println("Hola, soy un perro");
	}
	
}
