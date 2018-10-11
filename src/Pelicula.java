import java.util.Vector;


public class Pelicula {
	private String nombre;
	private String genero;
	private int duracion;
	private String idioma;
	private String subtitulos;
	private String calificacion;
	private String observaciones;
	private Vector<Establecimiento> establecimientos;
	private boolean estado;
	
	
	//Agregar la variable estado al Diagrama de Clases
	
	//VER LOS ERRORES EN ESTABLECIMIENTO AL CONECTAR A LA CLASE ESTABLECIMIENTO.
	
	
	// Constructor
	
	public Pelicula (String nombre, String genero, int duracion, String idioma, String subtitulos, String calificacion, String observaciones)
	{
		this.nombre=nombre;
		this.genero=genero;
		this.duracion=duracion;
		this.idioma=idioma;
		this.subtitulos=subtitulos;
		this.calificacion=calificacion;
		this.observaciones=observaciones;
		
		estado=true;
	
		establecimientos= new Vector<Establecimiento>();
		
	}

	
	// Getters & Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getSubtitulos() {
		return subtitulos;
	}

	public void setSubtitulos(String subtitulos) {
		this.subtitulos = subtitulos;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	public boolean getestado(){
		return estado;
	}
	
	public void setestado(boolean estado){
		this.estado=estado;
	}
	
	
	
	//Metodo de Negocio
	
		public void agregarEstablecimiento(Establecimiento e)
		{
			establecimientos.add(e);
		}
		
		
		private Establecimiento buscarEstablecimiento(int cuit) 
		{
			for (int i=0; i<establecimientos.size();i++)
			{
				if (establecimientos.elementAt(i).sosEstablecimiento(cuit))
					return establecimientos.elementAt(i);
					
			}
			return null;
		}

				
		public void eliminarEstablecimiento (int cuit)
		{
			establecimientos.remove(buscarEstablecimiento(cuit));
			
		}
		
		public boolean sosLaPelicula(String nombre) 
		{
			return  this.nombre==nombre;
		}
		
						
}


//Agregar el metodo BUSCARESTABLECIMIENTO al Diagrama de Clases

//Agregar el metodo SOSLAPELICULA al Diagrama de Clases

//Agregar y CREAR el metodo SOSELESTABLECIMIENTO al Diagrama de Clases
