package cajaRegistradora;

public class CajaRegistradora implements ICajaRegistradora
{
	private String nombre;
	private double[] tipoMonedas;
	private int[] contMonedas;
	
	public CajaRegistradora(String nombre, double ... tipoMonedas) 
	{
		this.nombre = nombre;
		this.tipoMonedas = tipoMonedas;
		contMonedas = new int [tipoMonedas.length];
	}
	
	@Override
	public String getNombre()
	{
		return nombre;
	}
	
	@Override
	public int getNumTipoMonedas()
	{
		return tipoMonedas.length;
	}

	@Override
	public int getUnidadesTipoMoneda(double tipo)
	{
		int posicion = -1;
		for (int i = 0; i < tipoMonedas.length; i++)
		{
			if (tipo == tipoMonedas[i])
			{
				posicion = i;
			}
		}
		if (posicion == -1)
		{
			return -1;
		}
		return contMonedas[posicion];
	}

	@Override
	public boolean meterMonedas(double tipo, int unidades)
	{
		int posicion = -1;
		for (int i = 0; i < tipoMonedas.length; i++)
		{
			if (tipo == tipoMonedas[i])
			{
				posicion = i;
			}
		}
		if (posicion == -1)
		{
			return false;
		}
		contMonedas[posicion] += unidades;
		return true;
	}

	@Override
	public boolean monedaValida(double tipo)
	{
		int posicion = -1;
		for (int i = 0; i < tipoMonedas.length; i++)
		{
			if (tipo == tipoMonedas[i])
			{
				posicion = i;
			}
		}
		if (posicion == -1)
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean sacarMonedas(double tipo, int unidades)
	{
		int posicion = -1;
		for (int i = 0; i < tipoMonedas.length; i++)
		{
			if (tipo == tipoMonedas[i])
			{
				posicion = i;
			}
		}
		if (posicion == -1 || unidades > contMonedas[posicion] )
		{
			return false;
		}
		contMonedas[posicion] -= unidades;
		return true;
	}

	@Override
	public void vaciarCajaRegistradora()
	{
		for (int i = 0; i < contMonedas.length; i++)
		{
			contMonedas[i] = 0;
		}
	}

	@Override
	public double[] getTiposDeMonedas()
	{
		return tipoMonedas;
	}

	@Override
	public double getSaldo()
	{
		double saldo = 0;
		for (int i = 0; i < contMonedas.length; i++)
		{
			saldo += contMonedas[i] * tipoMonedas[i];
		}
		return saldo;
	}
	
}
