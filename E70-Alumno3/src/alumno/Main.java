package alumno;

public class Main
{

	public static void main(String[] args)
	{
		try
		{
			Alumno a = new Alumno("Luis",-4);
			a.setNota(3);
		}
		catch(EdadNoValidaExcepcion e)
		{
			System.out.println("Edad menor a 0");
			e.printStackTrace();
		}
		catch (NotaNoValidaExcepcion e) 
		{
			System.out.println("Nota no valida");
			e.printStackTrace();
		}
		
	}

}
