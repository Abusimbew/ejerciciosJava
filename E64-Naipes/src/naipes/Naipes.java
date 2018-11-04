package naipes;

import java.util.Random;

public class Naipes implements INaipes
{
	
	private final String[] carta = {"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Sota","Caballo","Rey"};
	private final String[] palo = {"de oros","de copas","de espadas","de bastos"};
	private int[] baraja;
	private int cont;
	
	public Naipes()
	{
		cont = 40;
		baraja = new int[cont];
		for (int i = 0; i < cont; i++)
		{
			baraja[i] = i + 1;
		}
	}
	
	@Override
	public String traducir(int numCarta)
	{
		if (numCarta > 0 && numCarta <= cont)
		{
			return carta[(numCarta-1)%10]+" "+palo[(numCarta-1)/10];
		}
		else
			return "Número de carta inválido.";
	}
	@Override
	public void barajar()
	{
		Random posicion = new Random();
		int pos;
		int aux;
		for (int i = 0; i < cont; i++)
		{
			pos = posicion.nextInt(cont);
			
			aux = baraja[i];
			baraja[i] = baraja[pos];
			baraja[pos] = aux;
		}
	}
	
	public void mostrar()
	{
		for (int i = 0; i < cont; i++)
		{
			System.out.println(baraja[i]);
		}
	}
	
	@Override
	public int extraerCartaAlAzar()
	{
		Random numRandom = new Random();
		int aux = numRandom.nextInt(cont);
		int numCarta = baraja[aux];
		for (int i = aux; i < baraja.length-1; i++)
		{
			baraja[i] = baraja[i+1];
		}
		cont--;
		return numCarta;
	}

	@Override
	public int extraerCartaArriba()
	{
		if (cont == 0)
		{
			return -1;
		}
		cont--;
		return baraja[cont];
	}

	@Override
	public int extraerCarta(int posicion)
	{
		posicion -= 1;
		if (cont == 0 || posicion > cont)
		{
			return -1;
		}
		int num = baraja[posicion];
		for (int i = posicion; i < cont-1; i++)
		{
			baraja[i] = baraja[i + 1];
		}
		cont--;
		return num;
	}

	@Override
	public boolean ponerCarta(int numCarta)
	{
		for (int i = 0; i < baraja.length; i++)
		{
			if (numCarta == baraja[i] || numCarta > 40)
			{
				return false;
			}
		}
		cont++;
		baraja[cont] = numCarta;
		return true;
	}

	@Override
	public int getNumCartas()
	{
		return cont;
	}

	@Override
	public void ordenar()
	{
		int aux = -1;
		for (int i = 0; i < cont-1; i++)
		{
			for (int j = 0; j < cont-1; j++)
			{
				if (baraja[j] > baraja[j+1])
				{
					aux = baraja[j];
					baraja[j] = baraja[j+1];
					baraja[j+1] = aux;
				}
			}
		}
	}
	
}
