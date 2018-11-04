package nombres;

public class Nombres
{
	private int cuantos;
	private String nombres[];
	private int cont;

	public Nombres(int cuantos)
	{
		this.cuantos = cuantos;
		nombres = new String[cuantos];
		cont = 0;
	}

	public boolean anadir(String nombre)
	{
		if (cont == cuantos)
		{
			return false;
		}
		for (int i = 0; i < nombres.length; i++)
		{
			if (nombre.equals(nombres[i]))
			{
				return false;
			}
		}
		nombres[cont] = nombre;
		cont++;
		return true;
	}

	public boolean eliminar(String nombre)
	{
		int posicion = -1;
		for (int i = 0; i < cont; i++)
		{
			if (nombre.equals(nombres[i]))
			{
				posicion = i;
			}
		}
		if (posicion == -1)
		{
			return false;
		}
		for (int i = posicion; i < cont; i++)
		{
			nombres[i] = nombres[i + 1];
		}
		cont--;
		return true;
	}

	public void vaciar()
	{
		cont = 0;
	}

	public String mostrar(int posicion)
	{
		return nombres[posicion];
	}

	public int numNombres()
	{
		return cont;
	}

	public int maxNombres()
	{
		return cuantos;
	}

	public boolean estaLlena()
	{
		if (cont == cuantos)
		{
			return true;
		} else
			return false;
	}

}
