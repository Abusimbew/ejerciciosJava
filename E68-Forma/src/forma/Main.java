package forma;

public class Main
{

	public static void main(String[] args)
	{
		Rectangulo r = new Rectangulo("Juan","Azul",5,5);
		
		System.out.println(r.calcularArea());
		
		Triangulo t = new Triangulo("Luis","Amarillo",3,2);
		
		System.out.println(t.calcularArea());

	}

}
