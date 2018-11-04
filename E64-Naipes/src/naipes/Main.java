package naipes;

public class Main
{

	public static void main(String[] args)
	{
		Naipes uno = new Naipes();
		System.out.println(uno.traducir(40));
		uno.barajar();
		System.out.println("Mostrar barajada");
		uno.mostrar();
		uno.ordenar();
		System.out.println("\nOrdenada ");
		uno.mostrar();
		System.out.println(" ");
		System.out.println("Numero cartas: "+uno.getNumCartas());
		System.out.println("Extraer carta indicada: "+uno.extraerCarta(2));
		System.out.println("Numero cartas: "+uno.getNumCartas());
		System.out.println("Extraer arriba: "+uno.extraerCartaArriba());
		System.out.println("Numero cartas: "+uno.getNumCartas());
		System.out.println("Extraer al azar "+uno.extraerCartaAlAzar());
		System.out.println("Numero cartas: "+uno.getNumCartas());
		System.out.println("Mostrar barajada ");
		uno.barajar();
		uno.mostrar();
		uno.ordenar();
		System.out.println("\nMostrar ordenada ");
		uno.mostrar();
		
	}

}
