package rectangulo;

public class Rectangulo
{
	private float base;
	private float altura;
	private float x;
	private float y;
	
	Rectangulo(float base, float altura, float x, float y)
	{
		this.base = base;
		this.altura = altura;
		this.x = x;
		this.y = y;
	}
	
	Rectangulo(float base, float altura)
	{
		this.base = base;
		this.altura = altura;
		x = 0;
		y = 0;
	}
	
	Rectangulo(float base)
	{
		this.base = base;
		altura = 1;
		x = 0;
		y = 0;
	}
	
	Rectangulo( )
	{
		base = 1;
		altura = 1;
		x = 0;
		y = 0;
	}

	public float getBase()
	{
		return base;
	}

	public void setBase(float base)
	{
		this.base = base;
	}

	public float getAltura()
	{
		return altura;
	}

	public void setAltura(float altura)
	{
		this.altura = altura;
	}

	public float getX()
	{
		return x;
	}

	public void setX(float x)
	{
		this.x = x;
	}

	public float getY()
	{
		return y;
	}

	public void setY(float y)
	{
		this.y = y;
	}
	
	public float getArea()
	{
		return base * altura;
	}
	
	public float getPerimetro()
	{
		return 2 * (base + altura);
	}
	
	public void agranda(float aumentaBase, float aumentaAltura)
	{
		base += aumentaBase;
		altura += aumentaAltura;
	}
	
	public void agranda(float valor)
	{
		base += valor;
		altura += valor;
	}
	
	public void agranda()
	{
		base += 1;
		altura += 1;
	}
	
	
	
}
