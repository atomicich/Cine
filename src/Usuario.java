
public class Usuario {
	private String nombreUsuario;
	private String email;
	private String password;
	private String nombre;
	private String domicilio;
	private int dni;
	private String fechaDeNac;
	private boolean estado;
	private int tipo;
	
	
	// fechaDeNac VER FORMATO
	
	//Agregar la variable estado al Diagrama de Clases
	
	//Agregar la variable tipo al Diagrama de Clases
	
	
	//Constructor
	
	public Usuario(String usu, String email, String pass, String nom, String dom, int dni, String fecnac, int tipo)
	{
		this.nombreUsuario=usu;
		this.email=email;
		this.password=pass;
		this.domicilio=dom;
		this.dni=dni;
		this.fechaDeNac=fecnac;
		this.estado=true;
		this.tipo=tipo;
	}
	
	
	//Getters & Setters
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getFechaDeNac() {
		return fechaDeNac;
	}
	public void setFechaDeNac(String fechaDeNac) {
		this.fechaDeNac = fechaDeNac;
	}
	
	public boolean getestado() {
		return estado;
	}
	
	public void setestado(boolean estado) {
		this.estado=estado;
	}

	public int gettipo(){
		return tipo;
	}
	
	public void settipo(int tipo){
		this.tipo=tipo;
	}
	
	
	// Metodos de Negocio
	
	public boolean sosElUsuario(String nombreUsuario) 
	{
		return this.nombreUsuario==nombreUsuario;
	}
	
}
	
//Agregar el metodo SOSELUSUARIO al Diagrama de Clases
	
	
	
