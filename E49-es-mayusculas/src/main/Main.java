package main;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String cadena;
		
		System.out.println("Introduce una cadena.");
		cadena = sc.nextLine();
		sc.close();
		
		if (cadena.toUpperCase().equals(cadena))
		{
			System.out.println("Est� en mayusculas");
		}
		else
			System.out.println("No est� en mayusculas");
	}

}
