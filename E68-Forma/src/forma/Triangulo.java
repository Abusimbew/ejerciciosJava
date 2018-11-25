package forma;

public class Triangulo extends Forma
{
	public Triangulo(String nombre,String color,float base,float altura)
	{
		super(nombre,color,base,altura);
	}
	
	public float calcularArea()
	{
		return (getBase() * getAltura()) / 2;
	}
	
}
