import java.util.Vector;
public class Cine {

	private Vector<Usuario>usuarios;
	
	public Cine()
	{
		usuarios = new Vector<Usuario>();
		Cargainicial();
	}
	
	private void Cargainicial()
	{
		usuarios.add(new Usuario("natanael","natanael.jm@hotmail.com","1234","natanael","avenida vergara 1411",37122631,"02/10/1992",1));
	}
	/*
	private int log()
	{
		
	}
	*/
	public Usuario buscarUsuario(String nombre)
	{
		for(Usuario art : usuarios)
		{
			if (art.sosElUsuario(nombre))
				return art;
		}
		return null;
	}
}
