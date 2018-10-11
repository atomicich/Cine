import java.util.Vector;

public class Funcion {
	private int codigo;
	private int franjaHoraria;
	private Vector<AsientoVirtual>asientos;
	private Pelicula pelicula;
	private boolean estado;
	
	public Funcion(Pelicula pelicula, int franjaHoraria, int codigo) {
		this.franjaHoraria = franjaHoraria;
		this.pelicula = pelicula;
		asientos = new Vector<AsientoVirtual>();
		this.codigo = codigo;
		estado = true;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getFranjaHoraria() {
		return franjaHoraria;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void actualizarAsiento(AsientoVirtual a, boolean b){
		a.setDisponibilidad(b);
	}
	
	public void agregarAsiento(AsientoFisico a){
		if(a.isDisponibilidad()){
			asientos.add(new AsientoVirtual(a));
		}
	}
	
	public boolean sosFuncion(int cod){
		return codigo==cod;
	}
	

}
