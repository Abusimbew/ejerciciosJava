package naipes;

public interface INaipes
{
	public String traducir(int numCarta);
	
	public void barajar();
	
	public int extraerCartaAlAzar();
	
	public int extraerCartaArriba();
	
	public int extraerCarta(int posicion);
	
	public boolean ponerCarta(int numCarta);
	
	public int getNumCartas();
	
	public void ordenar();
}
