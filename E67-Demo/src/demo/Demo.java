package demo;

public class Demo
{

	public boolean esPar(int num)
	{
		if (num % 2 == 0)
		{
			return true;
		}
		return false;
	}
	
	public final boolean esImpar(int num)
	{
		if (num % 2 != 0)
		{
			return true;
		}
		return false;
	}

}
