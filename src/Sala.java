import java.util.Vector;

public class Sala {
	private String nombre;
	private int capacidad;
	private Vector<AsientoFisico>asientos;
	private Vector<Funcion>funciones;
	private Funcion funcion;
	private boolean estado;
	
	public Sala(String nombre) {
		this.nombre = nombre;
		this.capacidad = 0;
		asientos = new Vector<AsientoFisico>();
		funciones = new Vector<Funcion>();
		estado=true;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void generarAsientos(int f, int c){
		for(int fila=0;fila<f;fila++)
			for(int colum=1;colum<c;colum++){
				asientos.add(new AsientoFisico((char)('A'+fila),colum+1));
				capacidad++;
			}
	}
	
	public boolean agregarAsiento(char f,int c){
		if(buscarAsiento(f,c)==null){
			asientos.add(new AsientoFisico(f,c));
			capacidad++;
			return true;
		}
		return false;
		
	}
	
	private AsientoFisico buscarAsiento(char f, int c){
		for(AsientoFisico asiento : asientos){
			if(asiento.sosAsientoFisico(f, c))
				return asiento;
		}
		return null;
				
	}
	
	public void agregarFuncion(Pelicula pelicula, int franjaHoraria, int codigo){
		if(buscarFuncion(codigo)==null){
			funcion = new Funcion(pelicula,franjaHoraria,codigo);
			for(int i=0;i<asientos.size();i++){
				funcion.agregarAsiento(asientos.elementAt(i));
		
			}
		}
	}
	
	public void eliminarFuncion(int codFuncion){
		if(buscarFuncion(codFuncion)!=null){
			buscarFuncion(codFuncion).setEstado(false);;
		}
		
	}
	
	private Funcion buscarFuncion(int codigo){
		for(Funcion funcion : funciones){
			if(funcion.sosFuncion(codigo))
				return funcion;
		}
		return null;
	}
	
	public boolean sosSala(String nombre){
		return this.nombre==nombre;
	}
	
	public boolean existePelicula(Pelicula pelicula){
		for(int i=0;i<funciones.size();i++){
			if(funciones.elementAt(i).getPelicula()==pelicula)
				return true;
		}
		return false;
	}

}
