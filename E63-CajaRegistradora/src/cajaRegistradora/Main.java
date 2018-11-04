package cajaRegistradora;

import java.util.Scanner;

public class Main
{
	private static Scanner sc = new Scanner(System.in);
	private static CajaRegistradora caja;
	
	public static void main(String[] args)
	{	
		final double[] euros = {0.2,0.5,1,2,5,10,20,50,100,200};
		
		caja = new CajaRegistradora("Caja",euros);
		
		int num = 0;
		
		while (num != 6)
		{
			System.out.println("1.Ingresar monedas. (Pedirá tipo y unidades)" +
					"\n2.Listar contenido. (Por cada tipo de moneda, unidades.) "+
					"\n3.Mostrar saldo." +
					"\n4.Extraer monedas. (Pedirá tipo y número)"+
					"\n5.Vaciar caja." +
					"\n6.Salir.");
			num = sc.nextInt();
			switch(num)
			{
			case 1 :
				ingresarMonedas();
				break;
			case 2 :
				listarContenido();
				break;
			case 3 :
				mostrarSaldo();
				break;
			case 4 :
				extraerMonedas();
				break;
			case 5 :
				vaciarCaja();
				break;
			case 6 :
				break;
			default :
				System.out.println("Opción no válida.");
				break;
				
			}
		}
		sc.close();
	}
	
	public static void ingresarMonedas()
	{
		double tipo;
		int unidades;
		
		System.out.println("Tipo moneda: ");
		tipo = sc.nextDouble();
		
		if (caja.monedaValida(tipo))
		{
			System.out.println("Cuantas?");
			unidades = sc.nextInt();
			
			caja.meterMonedas(tipo, unidades);
		}
		else
			System.out.println("Moneda no válida.");
	}
	
	public static void listarContenido ()
	{
		for (double tipo : caja.getTiposDeMonedas())
		{
			System.out.println(tipo+" - "+caja.getUnidadesTipoMoneda(tipo));
		}
	}
	
	public static void mostrarSaldo()
	{
		System.out.println(caja.getSaldo());
	}
	
	public static void extraerMonedas()
	{
		double tipo;
		int unidades;
		
		System.out.println("Tipo moneda: ");
		tipo = sc.nextDouble();
		
		if (caja.monedaValida(tipo))
		{
			System.out.println("Cuantas?");
			unidades = sc.nextInt();
			
			System.out.println(caja.sacarMonedas(tipo, unidades));
		}
		else
			System.out.println("Moneda no válida.");
	}
	
	public static void vaciarCaja()
	{
		caja.vaciarCajaRegistradora();
	}
}
