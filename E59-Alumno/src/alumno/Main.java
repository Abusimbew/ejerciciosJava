package alumno;

public class Main
{

	public static void main(String[] args)
	{
		Alumno juan = new Alumno("Juan");
		
		System.out.println(juan.ponerNota(1, 10));
		System.out.println(juan.ponerNota(2, 7));
		System.out.println(juan.ponerNota(3, 9));
		System.out.println(juan.borrarNota(2));
		System.out.println(juan.numeroNotas());
		System.out.println(juan.notaMaxima());
		System.out.println(juan.tieneNota(0));
		System.out.println(juan.getNota(2));
		
	}

}
