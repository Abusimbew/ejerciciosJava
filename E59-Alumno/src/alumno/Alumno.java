package alumno;

public class Alumno
{
	private String nombre;
	private double[] notas;
	
	public Alumno(String nombre)
	{
		this.nombre = nombre;
		notas = new double[] {-1,-1,-1};
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public boolean ponerNota(int evaluacion, double nota)
	{
		if (Alumno.correcto(evaluacion, nota))
		{
			notas[evaluacion - 1] = nota;
			return true;
		}
		else
			return false;
	}
	
	public boolean borrarNota(int evaluacion)
	{
		if (Alumno.correcto(evaluacion))
		{
			notas[evaluacion - 1] = -1;
			return true;
		}
		else
			return false;
	}
	public int numeroNotas()
	{
		int cont = 0;
		for (int i = 0; i < notas.length; i++)
		{
			if (notas[i] != -1)
			{
				cont++;
			}
		}
		return cont;
	}
	
	public double notaMaxima()
	{
		double mayor = 0;
		boolean hay = false;
		
		for (int i = 0; i < notas.length; i++)
		{
			if (notas[i] > mayor)
			{
				mayor = notas[i];
				hay = true;
			}
		}
		if (hay)
		{
			return mayor;
		}
		else
			return -1;
	}
	
	public boolean tieneNota(int evaluacion)
	{
		if (Alumno.correcto(evaluacion))
		{
			if (notas[evaluacion - 1] != -1)
			{
				return true;
			}
			else
				return false;
		}
		else
			return false;
	}
	
	public double getNota(int evaluacion)
	{
		if (!Alumno.correcto(evaluacion) || notas[evaluacion - 1] == -1)
		{
			return -1;
		}
		else
		{
			return notas[evaluacion - 1];
		}
	}
	
	public static boolean correcto(int evaluacion, double nota)
	{
		if (evaluacion > 3 || evaluacion <= 0 || nota > 10 || nota < 0)
		{
			return false;
		}
		else
			return true;
	}
	
	public static boolean correcto(int evaluacion)
	{
		if (evaluacion > 3 || evaluacion <= 0)
		{
			return false;
		}
		else
			return true;
	}
}
