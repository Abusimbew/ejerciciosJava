package main;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase:");
		String cadena = sc.nextLine();
		
		System.out.println("Selecciona el caracter al excluir");
		String caracter = sc.nextLine();
		sc.close();
		
		for (int i = 0; i < cadena.length(); i++)
		{
			if (cadena.charAt(i) != caracter.charAt(0))
			{
				System.out.print(cadena.charAt(i));
			}
		}
	}

}
