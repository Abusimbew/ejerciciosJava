package main;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String elegir = "0";
		int cont = 0;
		String nombres[] = new String[5];
		String nombre;
		boolean cogido;
		while (!elegir.equals("5") && cont != nombres.length)
		{
			System.out.println("1.-Introducir nombre.\r\n" + 
					"2.-Listar nombres.\r\n" + 
					"3.-Eliminar nombre.\r\n" + 
					"4.-Eliminar todos los nombres.\r\n" + 
					"5.-Salir.");
			elegir = sc.nextLine();
			switch (elegir)
			{
			//listar nombres
				case "1":
					if (cont == nombres.length)
					{
						System.out.println("No hay espacio.");
					}
					nombre = sc.nextLine();
					cogido = true;
					for (int i = 0; i < nombres.length; i++)
					{
						if (nombre.equals(nombres[i]))
						{
							cogido = false;
						}
					}
					if (cogido)
					{
						
						nombres[cont] = nombre;
						cont++;
						System.out.println("Nombre introducido.");
					}
					else
						System.out.println("Nombre repetido.");
				break;
				//Listar nombres
				case "2":
					for (int i = 0; i < cont; i++)
					{
						System.out.println(i+1+".-"+nombres[i]);
					}
					break;
					//Eliminar nombre
				case "3":
					nombre = sc.nextLine();
					int pos = -1;
					boolean noEncontrado = true;
					for (int i = 0; i < cont; i++)
					{
						if (nombre.equalsIgnoreCase(nombres[i]))
						{
							pos = i;
							noEncontrado = false;
							
						}
					}
					if (noEncontrado)
					{
						System.out.println("No encontrado.");
					}
					else
					{
						for (int i = pos; i < cont; i++)
						{
							nombres[i] = nombres[i+1];
						}
						cont--;
						System.out.println("Eliminado");
					}
					break;
					//Eliminar todos los nombres
				case "4":
					cont = 0;
					break;
				case "5":
					break;
			}
		}
		sc.close();
	}

}
