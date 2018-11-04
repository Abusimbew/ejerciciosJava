package main;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un número:");
		numero = sc.nextInt();
		
		sc.close();
		if (numero % 2 == 0)
		{
			System.out.println("Es par");
		} else
			System.out.println("Es impar");
		
		boolean capicua = true;
		String num = String.valueOf(numero);
		for (int i = 0; i < num.length() && capicua; i++)
		{
			if (num.charAt(i) != num.charAt(num.length()-1-i))
			{
				capicua = false;
			}
		}
		
		if (capicua)
		{
			System.out.println("Es capicua");
		}
		else
			System.out.println("No es capicua");
	}

}
