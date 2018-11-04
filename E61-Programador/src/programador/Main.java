package programador;

public class Main
{

	public static void main(String[] args)
	{
		Programador uno = new Programador("Juan","91235235","c++","java");
		
		for(String lenguaje: uno.getLenguajes())
		{
			System.out.println(lenguaje);
		}

	}

}
