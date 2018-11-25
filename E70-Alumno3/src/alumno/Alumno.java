package alumno;

public class Alumno
{
	private String nombre;
	private int edad;
	private double nota;
	
	public Alumno(String nombre, int edad) throws EdadNoValidaExcepcion
	{
		this.nombre = nombre;
		if (edad < 0)
		{
			throw new EdadNoValidaExcepcion("Edad inválida.");
		}
		this.edad = edad;
	}
	
	public double getNota()
	{
		return nota;
	}
	
	public void setNota(double nota) throws NotaNoValidaExcepcion
	{
		if (nota < 0 || nota > 10)
		{
			throw new NotaNoValidaExcepcion("Nota inválida.");
		}
		this.nota = nota;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public int getEdad()
	{
		return edad;
	}
	
}

