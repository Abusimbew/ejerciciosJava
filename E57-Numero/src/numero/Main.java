package numero;

public class Main
{

	public static void main(String[] args)
	{
		int[] nums = {1,8,7,6,10,2};
		Numero.ordena(nums, 0);
		for (int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i]+" ");
		}
		
		System.out.println("\n"+Numero.esCapicua(6336));
		System.out.println(Numero.esPerfecto(6));
		System.out.println(Numero.sonAmigos(1184, 1210));
		
		/*for (int i : Numero.extraeDivisores(6))
		{
			System.out.println(i);
		}*/
		
		
	}

}
