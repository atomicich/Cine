import java.time.LocalDate;
import java.util.Vector;

public abstract class venta {

	protected int codVenta;
	protected LocalDate fecha;
	protected float total;
	protected Establecimiento establecimiento;
	protected Funcion funcion;
	protected Sala sala;
	protected Pelicula pelicula;
	protected Vector<AsientoVirtual>asientos;
	
	
	private static int proxnumero;
	
	public static int getproxnumero(){
		
			return ++proxnumero;
		
	}

	/**
	 * @param codVenta
	 * @param fecha
	 * @param total
	 * @param establecimiento
	 * @param funcion
	 * @param sala
	 * @param pelicula
	 * @param asientos
	 * @param sala 
	 */
	protected venta(int codVenta, float total, Establecimiento establecimiento, Funcion funcion, Pelicula pelicula, Vector<AsientoVirtual> asientos, Sala sala) {
		codVenta = getproxnumero();
		fecha = LocalDate.now();
		total=0;
		this.establecimiento = establecimiento;
		this.funcion = funcion;
		this.sala = sala;
		this.pelicula = pelicula;
		asientos= new Vector<AsientoVirtual>();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public float getTotal() {
		return total;
	}

	public Establecimiento getEstablecimiento() {
		return establecimiento;
	}

	public Funcion getFuncion() {
		return funcion;
	}

	public Sala getSala() {
		return sala;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public Vector<AsientoVirtual> getAsientos() {
		return asientos;
	}
	
	
	public void actualizarAsiento(Funcion f, AsientoVirtual a,boolean b){
		
		f=getFuncion();
		a.setDisponibilidad(b);
		
	}
	
	
	public abstract float calcularGanancia();
	
	
}
