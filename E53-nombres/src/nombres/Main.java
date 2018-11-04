package nombres;

public class Main
{

	public static void main(String[] args)
	{
		Nombres nombre1 = new Nombres(5);
		
		nombre1.anadir("juan");
		nombre1.anadir("alberto");
		nombre1.anadir("luis");
		System.out.println(nombre1.anadir("jose"));
		System.out.println("¿Cuantos nombres? "+nombre1.maxNombres());
		System.out.println("¿Está llena? "+nombre1.estaLlena());
		System.out.println("Hay "+nombre1.numNombres()+" nombres.");
		System.out.println(nombre1.mostrar(0));
		System.out.println(nombre1.eliminar("alberto"));
		System.out.println("Hay "+nombre1.numNombres()+" nombres.");
	}

}
