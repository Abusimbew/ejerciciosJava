package main;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String primera;
		String segunda;
		
		System.out.println("Introduce la primera cadena.");
		primera = sc.nextLine();
		
		System.out.println("Introduce la segunda cadena.");
		segunda = sc.nextLine();
		sc.close();
	
		System.out.println("Cadenas entrelazadas:");
		for (int i = 0; i < primera.length() + segunda.length(); i++)
		{
			if (i < primera.length())
			{
				System.out.print(primera.charAt(i));
			}
			if (i < segunda.length())
			{
				System.out.print(segunda.charAt(i));
			}
		}

	}

}
