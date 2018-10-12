import java.util.Vector;

public class ventaTarjetaC extends venta{
	
	private int nrotarjeta;
	private int codtarjeta;
	private String tipotarjeta;
	private static float comision;
	private String fechavto;
	/**
	 * @param codVenta
	 * @param total
	 * @param establecimiento
	 * @param funcion
	 * @param pelicula
	 * @param asientos
	 * @param sala
	 * @param nrotarjeta
	 * @param codtarjeta
	 * @param tipotarjeta
	 * @param comision
	 * @param fechavto
	 */
	protected ventaTarjetaC( int nro, int codigo,
			String tipotar, String fecha) {
		super();
		nrotarjeta = nro;
		codtarjeta = codigo;
		tipotarjeta = tipotar;
		fechavto = fecha;
	}
	public int getNrotarjeta() {
		return nrotarjeta;
	}
	public void setNrotarjeta(int nrotarjeta) {
		this.nrotarjeta = nrotarjeta;
	}
	public int getCodtarjeta() {
		return codtarjeta;
	}
	public void setCodtarjeta(int codtarjeta) {
		this.codtarjeta = codtarjeta;
	}
	public String getTipotarjeta() {
		return tipotarjeta;
	}
	public void setTipotarjeta(String tipotarjeta) {
		this.tipotarjeta = tipotarjeta;
	}
	public static float getComision() {
		return comision;
	}
	public static void setComision(float comision) {
		ventaTarjetaC.comision = comision;
	}
	public String getFechavto() {
		return fechavto;
	}
	public void setFechavto(String fechavto) {
		this.fechavto = fechavto;
	}
	
	public float calcularGanancia()
	{
		return total * (1- comision);
	}
	

}
