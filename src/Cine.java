import java.util.Vector;
public class Cine {

	private Vector<Usuario>usuarios;
	private Vector<Establecimiento>establecimientos;
	private Usuario actual;
	
	public Cine()
	{
		usuarios = new Vector<Usuario>();
		Cargainicial();
	}
	
	private void Cargainicial()
	{
		usuarios.add(new Usuario("natanael","natanael.jm@hotmail.com","1234","natanael","avenida vergara 1411",37122631,"02/10/1992",1));
		usuarios.add(new Usuario("axel","lalala","123","axel","lalala",45234,"04/11/1992",2));
		//establecimientos.add(new Establecimiento(1234,"Hoyts","lalala 321"));
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
			if (a.getNombreUsuario().equalsIgnoreCase(nombre))
				return a;
		} 
		return null;
	}
	
	public Establecimiento buscarEstablecimiento(int cuit){
		for(int i=0;i<establecimientos.size();i++){
			Establecimiento a = (Establecimiento)establecimientos.elementAt(i);
			if(a.sosEstablecimiento(cuit))
				return a;
		}
		return null;
	}
	
	public void agregarEstablecimiento(int cuit, String nombre, String domicilio){
		establecimientos.add(new Establecimiento(cuit,nombre,domicilio));
	}
}
