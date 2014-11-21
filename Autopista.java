/*
 * Clase Autopista
 *
 */

public class Autopista {
	
	private String origen;
	private String destino;
	private int peaje;

	public String getOrigen(){
		return this.origen;
	}

	public String getDestino(){
		return this.destino;
	}

	public int getPeaje(){
		return this.peaje;
	}

	public void setPeaje(int nuevoPeaje){
		this.peaje = nuevoPeaje;
	}

}