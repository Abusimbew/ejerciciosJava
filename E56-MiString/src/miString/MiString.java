package miString;

public class MiString
{
	public static String alReves(String cadena)
	{
		String[] alReves = cadena.split("");
		String vuelta = "";
		for (int i = alReves.length-1; i >= 0; i--)
		{
			vuelta += alReves[i];
		}
		return vuelta;
	}
	
	public static String limpiaCaracteres(String c1, String c2)
	{
		String nuevo = "";
		for (int i = 0; i < c1.length(); i++)
		{
			for (int j = 0; j < c2.length() ; j++)
			{
				if (c1.charAt(i) != c2.charAt(j))
				{
					nuevo += c1.charAt(i);
				}
			}
		}
		return nuevo;
	}
	
	public static String sustituye (String cadena,char a, char b)
	{
		String nuevo = "";
		for (int i = 0; i < cadena.length(); i++)
		{
			if (cadena.charAt(i) == a)
			{
				nuevo += b;
			}
			else
				nuevo += cadena.charAt(i);
		}
		return nuevo;
	}
	
	public static boolean todosIguales(String cadena)
	{
		for (int i = 0; i < cadena.length(); i++)
		{
			for (int j = 0; j < cadena.length(); j++)
			{
				if (j != i && cadena.charAt(i) != cadena.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static String quitaEspacios(String cadena)
	{
		String nuevo = "";
		for (int i = 0; i < cadena.length(); i++)
		{
			if (cadena.charAt(i) != ' ')
			{
				nuevo += cadena.charAt(i);
			}
		}
		return nuevo;
	}
	
	public static boolean esNumeroEntero(String cadena)
	{
		for (int i = 0; i < cadena.length(); i++)
		{
			if (cadena.charAt(i) < '0' || cadena.charAt(i) > '9')
			{
				return false;
			}
		}
		return true;
	}
	
}
