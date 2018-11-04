package main;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena");
		String[] dividido = sc.nextLine().split(" ");
		sc.close();
		
		for (int i = dividido.length - 1; i >= 0; i--)
		{
			System.out.print(dividido[i]+" ");
		}

	}

}
