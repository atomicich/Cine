
public class AsientoFisico {
	private char fila;
	private int columna;
	private boolean disponibilidad;
	public AsientoFisico(char fila, int columna) {
		this.fila = fila;
		this.columna = columna;
		disponibilidad= true;
	}
	public char getFila() {
		return fila;
	}

	public int getColumna() {
		return columna;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	public boolean sosAsientoFisico(char f, int c){
		return (fila==f&&columna==c);
	}
	
	
	
	

}
