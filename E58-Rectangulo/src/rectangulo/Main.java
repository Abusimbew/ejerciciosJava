package rectangulo;

public class Main
{

	public static void main(String[] args)
	{
		Rectangulo p = new Rectangulo(2,3);
		
		System.out.println(p.getAltura());
		System.out.println(p.getBase());
		System.out.println(p.getX());
		System.out.println(p.getY());
		p.agranda(2);
		System.out.println(p.getArea());;
		System.out.println(p.getPerimetro());
	}

}
