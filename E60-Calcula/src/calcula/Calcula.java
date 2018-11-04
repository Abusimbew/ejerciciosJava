package calcula;

public class Calcula
{
	public static int mayor(int ... num)
	{
		int mayor = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++)
		{
			if (num[i] > mayor)
			{
				mayor = num[i];
			}
		}
		return mayor;
	}
	
	public static double mayor(double ... num)
	{
		double mayor = Double.MIN_VALUE;
		for (int i = 0; i < num.length; i++)
		{
			if (num[i] > mayor)
			{
				mayor = num[i];
			}
		}
		return mayor;
	}
	
	public static String mayor(String ... cadena)
	{
		String mayor = "";
		for (int i = 0; i < cadena.length; i++)
		{
			if (cadena[i].length() > mayor.length())
			{
				mayor = cadena[i];
			}
		}
		return mayor;
	}
	
	public static int menor(int ... num)
	{
		int menor = Integer.MAX_VALUE;
		for (int i = 0; i < num.length; i++)
		{
			if (num[i] < menor)
			{
				menor = num[i];
			}
		}
		return menor;
	}
	
	public static double menor(double ... num)
	{
		double menor = Double.MAX_VALUE;
		for (int i = 0; i < num.length; i++)
		{
			if (num[i] < menor)
			{
				menor = num[i];
			}
		}
		return menor;
	}
	
	public static String menor(String ... cadena)
	{
		String menor = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
		for (int i = 0; i < cadena.length; i++)
		{
			if (cadena[i].length() < menor.length())
			{
				menor = cadena[i];
			}
		}
		return menor;
	}
	
	
	
}

