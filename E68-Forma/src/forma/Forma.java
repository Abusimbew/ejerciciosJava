package forma;

public abstract class Forma
{
	private String nombre;
	private float base, altura, posicionX, posicionY;
	private String color;
	
	public Forma(String nombre,String color,float base,float altura)
	{
		this.nombre = nombre;
		this.color = color;
		this.altura = altura;
		this.base = base;
		posicionX = 0;
		posicionY = 0;
	}
	
	public abstract float calcularArea();

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
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

	public float getPosicionX()
	{
		return posicionX;
	}

	public void setPosicionX(float posicionX)
	{
		this.posicionX = posicionX;
	}

	public float getPosicionY()
	{
		return posicionY;
	}

	public void setPosicionY(float posicionY)
	{
		this.posicionY = posicionY;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}
	
	
}
