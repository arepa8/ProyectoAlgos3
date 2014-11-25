/**
 * Clase Autopista
 * @author	Andres Hernandez
 *			Alfredo Delgado	
 */

public class Autopista {
	
	private String origen;
	private String destino;
	private int peaje;

	public Autopista(String origenNuevo, String destinoNuevo, int peajeNuevo){
		this.origen		= origenNuevo;
		this.destino	= destinoNuevo;
		this.peaje 		= peajeNuevo;
	}

	public String getOrigen(){
		return this.origen;
	}

	public String getDestino(){
		return this.destino;
	}

	public int getPeaje(){
		return this.peaje;
	}

	public void setOrigen(String nuevoOrigen){
		this.origen = nuevoOrigen;
	}

	public void setPeaje(String nuevoDestino){
		this.destino = nuevoDestino;
	}

	public void setPeaje(int nuevoPeaje){
		this.peaje = nuevoPeaje;
	}

	@Override
	public String toString(){
		return this.origen+" "+this.destino+" "+this.peaje;
	}

	public static void main(String[] args) {
		Autopista arc = new Autopista ("Caracas","Maracay",100);
		System.out.println(arc);
	}

}