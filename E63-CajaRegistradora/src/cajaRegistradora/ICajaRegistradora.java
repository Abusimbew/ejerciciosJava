package cajaRegistradora;

public interface ICajaRegistradora
{
	/**
	* @return Nombre de la caja registradora
	*/
	public String getNombre();
	/**
	* @return N�mero de tipos de moneda que hay en la caja.
	*/
	public int getNumTipoMonedas();
	/**
	* @param tipo
	* @return Devuelve el n�mero de unidades del tipo de moneda pasado como par�metro.
	* -1 en el caso en el que el tipo de moneda no sea v�lido.
	*/
	public int getUnidadesTipoMoneda(double tipo);
	/**
	* Ingresa el n�mero de monedas indicado y del tipo indicado.
	* @param tipo
	* @param unidades
	* @return true si los par�metros son v�lidos, false si no
	*/
	public boolean meterMonedas(double tipo, int unidades);
	/**
	* Valida un tipo de moneda
	* @param tipo
	* @return true si es v�lida, false si no
	*/
	public boolean monedaValida(double tipo);
	/**
	* Extrae de la caja el n�mero de unidades del tipo de moneda especificado
	* @param tipo
	* @param unidades
	* @return true si ha sido posible, false en caso contrario.
	*/
	public boolean sacarMonedas(double tipo, int unidades);
	/**
	* Vac�a la caja registradora.
	*/
	public void vaciarCajaRegistradora();
	/**
	* @return Devuelve un array con los tipos de monedas que tiene.
	*/
	public double[] getTiposDeMonedas();
	/**
	* @return Devuelve el saldo actual de la caja
	*/
	public double getSaldo();
}
