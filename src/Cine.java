import java.util.Vector;
public class Cine {

	private Vector<Usuario>usuarios;
	private Vector<Establecimiento>establecimientos;
	private Usuario actual;
	
	public Cine()
	{
		usuarios = new Vector<Usuario>();
		establecimientos = new Vector<Establecimiento>();
		Cargainicial();
	}
	
	private void Cargainicial()
	{
		usuarios.add(new Usuario("natanael","natanael.jm@hotmail.com","1234","natanael","avenida vergara 1411",37122631,"02/10/1992",1));
		usuarios.add(new Usuario("axel","lalala","123","axel","lalala",45234,"04/11/1992",2));
		establecimientos.add(new Establecimiento(1234,"Hoyts","lalala 321"));
		establecimientos.elementAt(0).agregarSala("asd");
	}

	public int loguear(String usuario, String password)
	{
		actual = buscarUsuario(usuario);
			if(actual!=null){
				if(actual.getPassword().equalsIgnoreCase(password))
					return actual.gettipo();
				else
					return 0;

			}else
				return 0;
	}
	
	public Usuario buscarUsuario(String nombre)
	{
		for (int i=0;i< usuarios.size();i++)
		{
			Usuario a = (Usuario)usuarios.elementAt(i);
			if (a.getNombreUsuario().equalsIgnoreCase(nombre)&&a.getestado())
				return a;
		} 
		return null;
	}
	
	public Establecimiento buscarEstablecimiento(int cuit){
		for(int i=0;i<establecimientos.size();i++){
			Establecimiento a = (Establecimiento)establecimientos.elementAt(i);
			if(a.sosEstablecimiento(cuit)&&a.isEstado())
				return a;
		}
		return null;
	}
	
	public void agregarEstablecimiento(int cuit, String nombre, String domicilio){
		establecimientos.add(new Establecimiento(cuit,nombre,domicilio));
	}
	
	public void modificarEstablecimiento(int cuit, String nombre, String domicilio){
		Establecimiento a = buscarEstablecimiento(cuit);
		a.setNombre(nombre);
		a.setDomicilio(domicilio);
	}
	
	public boolean agregarSala(int cuit, String nombreSala){
		Establecimiento a = buscarEstablecimiento(cuit);
		if(a.agregarSala(nombreSala))
			return true;
		else
			return false;
	}
	
	public void generarAsientos(int cuit, String nombreSala, int f, int c){
		Establecimiento a = buscarEstablecimiento(cuit);
		a.generarAsientos(nombreSala, f, c);
		
	}
	
	public void agregarUsuario(String usu, String email, String pass, String nom, String dom, int dni, String fecnac, int tipo){
		usuarios.add(new Usuario(usu, email,pass,nom, dom,dni,fecnac,tipo));
	}
}
