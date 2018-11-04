package main;

public class Main
{

	public static void main(String[] args)
	{
		System.out.println("Números: ");
		for (int i = 0; i < args.length; i++)
		{
			System.out.print(args[i]+" ");
		}
		int suma = 0;
		for (int i = 0; i < args.length; i++)
		{
			suma += Integer.parseInt(args[i]);
		}
		System.out.println("\nLa suma es: "+suma);
	}

}
