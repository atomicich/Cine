import java.util.Vector;

public class ventaEfectivo extends venta {
	
	

	
	
	public ventaEfectivo(int codVenta, float total, Establecimiento establecimiento, Funcion funcion, Pelicula pelicula,
			Vector<AsientoVirtual> asientos, Sala sala) {
		super(codVenta, total, establecimiento, funcion, pelicula, asientos, sala);
	}

	public float calcularGanancia() {
		
		return total;
	}
	

}
