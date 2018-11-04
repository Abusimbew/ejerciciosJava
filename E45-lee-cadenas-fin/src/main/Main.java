package main;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String aux = "";
		String cadena;
		
		System.out.println("Cadena:");
		cadena = sc.nextLine();
		
		while (!cadena.equals("fin"))
		{
			if (cadena.length() > aux.length())
			{
				aux = cadena;
			}
			System.out.println("Cadena:");
			cadena = sc.nextLine();
		}
		sc.close();
		
		System.out.println("Mayor: "+aux);
	}

}
