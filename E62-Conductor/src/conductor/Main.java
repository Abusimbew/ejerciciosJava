package conductor;

public class Main
{

	public static void main(String[] args)
	{
		Conductor uno = new Conductor("juan","91235235");
		
		uno.sumarKilometros(230);
		uno.sumarKilometros(130);
		
		uno.pasaPorCiudad("madrid");
		uno.pasaPorCiudad("jaen");
		uno.pasaPorCiudad("valencia");
		uno.pasaPorCiudad("valladolid");
		
		System.out.println(uno.getTotalKilometros());
		for (String ciudades : uno.getCiudadesRecorridas())
		{
			System.out.println(ciudades);
		}

	}

}
