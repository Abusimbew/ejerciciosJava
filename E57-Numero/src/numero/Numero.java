package numero;

public class Numero
{
	/*public static boolean esPrimo(int num)
	{
		
	}*/
	
	public static boolean esPerfecto(int num)
	{
		int cont = 1;
		int suma = 0;
		
		for (int i = 0; i <= num / 2; i++)
		{
			if (num % cont == 0)
			{
				suma += cont;
			}
			cont++;
		}
		if (suma == num)
		{
			return true;
		}else
			return false;
	}
	
	public static boolean esCapicua(int num)
	{
		String numero = Integer.toString(num);
		for (int i = 0; i < numero.length() / 2; i++)
		{
			if (numero.charAt(i) != numero.charAt(numero.length() - i -1))
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean sonAmigos(int num1, int num2)
	{
		int suma1 = 0;
		int suma2 = 0;
		int cont1 = 1;
		int cont2 = 1;
		
		for (int i = 0; i <= num1 / 2; i++)
		{
			if (num1 % cont1 == 0)
			{
				suma1 += cont1;
			}
			cont1++;
		}
		for (int i = 0; i <= num2 / 2; i++)
		{
			if (num2 % cont2 == 0)
			{
				suma2 += cont2;
			}
			cont2++;
		}
		
		if(suma1 == num2 && suma2 == num1)
		{
			return true;
		}
		else
			return false;
	}
	
	public static int[] extraeDivisores(int num)
	{
		int cont = 0;
		for (int i = 0; i <= num / 2; i++)
		{
			if (num % cont == 0)
			{
				cont++;
			}
		}
		int[] divisores = new int[cont];
		int cont1 = 0;
		for (int i = 0; i < num; i++)
		{
			if (num % i == 0)
			{
				divisores[cont1] = i;
				cont1++;
			}
		}
		return divisores;
	}
	
	public static void duplica(int[] nums)
	{
		for (int i = 0; i < nums.length; i++)
		{
			nums[i] = nums[i] * 2;
		}
	}
	
	public static void ordena(int[] nums, int num)
	{
		boolean ordena = false;
		int aux;
		
		for (int i = 0; i < nums.length - 1 && !ordena; i++)
		{
			ordena = true;
			for (int j = 0; j < nums.length - 1; j++)
			{
				if ((num > 0 && nums[j] > nums[j+1]) || (num <= 0 && nums[j] < nums[j+1]))
				{
					aux = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = aux;
					
					ordena = false;
				}
			}
			
		}
	}
	
	/*public static void ordena(int[] numeros, int tipoOrden)
	{
		boolean ordenado = false;
		int aux;
		
		for (int i = 0; i < numeros.length - 1 && !ordenado; i++)
		{
			ordenado = true;
			for (int j = 0; j < numeros.length - 1 - i; j++)
			{
				if((tipoOrden == ASCENDENTE && numeros[j] > numeros[j + 1])
						|| (tipoOrden == DESCENDENTE && numeros[j] < numeros[j + 1]))
				{
					aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;

					ordenado = false;
				}
			}
		}
	}*/
	
}
