package vehiculo;

public class Vehiculo
{
	private int numeroRuedas;
	private int velocidadMaxima;
	private int velocidadActual;
	private int peso;
	
	public Vehiculo (int numeroRuedas,int velocidadMaxima, int velocidadActual,int peso)
	{
		this.numeroRuedas = numeroRuedas;
		this.velocidadActual = velocidadActual;
		this.velocidadMaxima = velocidadMaxima;
		this.peso = peso;
	}
	
	public int getNumeroRuedas()
	{
		return numeroRuedas;
	}
	
	public void setNumeroRuedas(int numeroRuedas)
	{
		this.numeroRuedas = numeroRuedas;
	}

	public int getVelocidadMaxima()
	{
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima)
	{
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getVelocidadActual()
	{
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual)
	{
		this.velocidadActual = velocidadActual;
	}

	public int getPeso()
	{
		return peso;
	}

	public void setPeso(int peso)
	{
		this.peso = peso;
	}

	public boolean esIgual(Vehiculo vehiculo) 
	{
		if (numeroRuedas != vehiculo.numeroRuedas || velocidadActual != vehiculo.velocidadActual ||
				velocidadMaxima != vehiculo.velocidadMaxima || peso != vehiculo.peso)
		{
			return false;
		}
		return true;
	}
	
	public void copia(Vehiculo vehiculo)
	{
		vehiculo.numeroRuedas = numeroRuedas;
		vehiculo.peso = peso;
		vehiculo.velocidadActual = velocidadActual;
		vehiculo.velocidadMaxima = velocidadMaxima;
	}
}
