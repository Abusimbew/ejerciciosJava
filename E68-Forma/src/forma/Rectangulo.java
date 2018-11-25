package forma;

public class Rectangulo extends Forma
{
	public Rectangulo(String nombre, String color, float base, float altura)
	{
		super(nombre, color, base, altura);
	}
	
	public float calcularArea()
	{
		return getBase() * getAltura();
	}
}
