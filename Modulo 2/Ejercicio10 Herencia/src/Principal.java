
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
	}

}
