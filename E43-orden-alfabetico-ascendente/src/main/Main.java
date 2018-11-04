package main;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		String[] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r",
				"s","t","v","w","x","y","z"};
		
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		System.out.println("Introduce 10 palabras.");
		
		String[] palabras = new String[10];
		
		String palabra;

		boolean orden;
		int j = 0;
		while (cont < 10)
		{
			palabra = sc.nextLine();
			orden = true;
			for (int i = 0; i < letras.length && orden; i++)
			{
				if(palabra.charAt(0) > letras[i].charAt(0))
				{
					palabras[j] = palabra;
					j++;
					orden = false;
				}
			}
			cont++;
		}
		sc.close();
		for (int i = 0; i < palabras.length-1; i++)
		{
			System.out.println(palabras[i]);
		}
		System.out.println(palabras[0].charAt(0)+letras[0].charAt(0));
	}

}
