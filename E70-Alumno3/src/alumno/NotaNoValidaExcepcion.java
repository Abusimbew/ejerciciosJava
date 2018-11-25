package alumno;

public class NotaNoValidaExcepcion extends Exception
{
	private static final long serialVersionUID = -7736352435452903092L;

	public NotaNoValidaExcepcion(String msj)
	{
		super(msj);
	}
}
