
public class AsientoVirtual {
	private char fila;
	private int columna;
	private boolean disponibilidad;
	public AsientoVirtual(AsientoFisico a) {
		fila = a.getFila();
		columna = a.getColumna();
		disponibilidad = true;
		
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public char getFila() {
		return fila;
	}
	public int getColumna() {
		return columna;
	}
	
	
	
	

}
