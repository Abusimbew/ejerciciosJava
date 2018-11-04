package empleado;

public class Empleado
{
	private String nombre;
	private String telefono;
	private static int cont = 0;
	
	public Empleado(String nombre, String telefono)
	{
		this.nombre = nombre;
		this.telefono = telefono;
		cont++;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public String getTelefono()
	{
		return telefono;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}
	
	public static int getNumeroEmpleados()
	{
		return cont;
	}
}
