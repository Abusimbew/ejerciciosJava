package main;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String frase;
		
		System.out.println("Introduce una frase:");
		frase = sc.nextLine();
		sc.close();
		
		String[] cortadas = frase.split(" ");
		
		for (int i = cortadas.length - 1; i > -1; i--)
		{
			System.out.print(cortadas[i]+" ");
		}

	}

}
