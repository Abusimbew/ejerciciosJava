package empleado;

import java.util.Scanner;


public class Main
{

	public static void main(String[] args)
	{
		Empleado[] empleado1 = new Empleado[4];
		
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		String telefono;
		
		for (int i = 0; i < empleado1.length; i++)
		{
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			
			System.out.println("Telefono: ");
			telefono = sc.nextLine();
			
			empleado1[i] = new Empleado(nombre,telefono); 
		}
		sc.close();
		
		for (int i = 0; i < empleado1.length; i++)
		{
			System.out.println("Nombre: "+empleado1[i].getNombre()+" Telefono: "+empleado1[i].getTelefono());
		}
		System.out.println("Total empleados: "+Empleado.getNumeroEmpleados());
		
	}

}
