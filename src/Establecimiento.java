import java.util.Vector;

public class Establecimiento {
	private int cuit;
	private String nombre;
	private String domicilio;
	private int cantSalas;
	private int capacidadTotal;
	private Vector<Sala>salas;
	private boolean estado;
	
	public Establecimiento(int cuit, String nombre, String domicilio) {
		this.cuit = cuit;
		this.nombre = nombre;
		this.domicilio = domicilio;
		cantSalas=0;
		capacidadTotal=0;
		salas = new Vector<Sala>();
		estado=true;
	}

	public int getCuit() {
		return cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public int getCantSalas() {
		return cantSalas;
	}

	public int getCapacidadTotal() {
		return capacidadTotal;
	}
	
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void agregarSala(String nombre){
		if(buscarSala(nombre)==null){
			salas.add(new Sala(nombre));
		}
		
	}
	
	private Sala buscarSala(String nombre){
		for(Sala s : salas){
			if(s.sosSala(nombre))
				return s;
		}
		return null;
	}
	
	public void agregarFuncion(String sala, Pelicula pelicula, int franjaHoraria, int codigo){
		if(buscarSala(sala)!=null)
			buscarSala(sala).agregarFuncion(pelicula, franjaHoraria, codigo);
	}
	
	public void eliminarSala(String nombre){
		if(buscarSala(nombre)!=null){
			buscarSala(nombre).setEstado(false);
		}
	}
	
	public boolean existePelicula(Pelicula pelicula){
		for(int i=0;i<salas.size();i++){
			if(salas.elementAt(i).existePelicula(pelicula))
				return true;
		}
		return false;
	}
	
	public boolean sosEstablecimiento(int cuit){
		return this.cuit==cuit;
	}

}
