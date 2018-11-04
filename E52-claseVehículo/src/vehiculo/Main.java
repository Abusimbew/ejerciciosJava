package vehiculo;

public class Main
{

	public static void main(String[] args)
	{
		Vehiculo vehiculo1 = new Vehiculo(2,1,3,1);
		Vehiculo vehiculo2 = new Vehiculo(1,2,1,1);
		
		System.out.println(vehiculo1.getNumeroRuedas());
		vehiculo1.setNumeroRuedas(4);
		System.out.println(vehiculo1.getNumeroRuedas());
		System.out.println(vehiculo1.esIgual(vehiculo2));
		vehiculo2.copia(vehiculo1);
		System.out.println(vehiculo1.esIgual(vehiculo2));
		
	}

}
