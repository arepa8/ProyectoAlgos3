/**
 * Clase Ciudad
 * @author	Andres Hernandez
 *			Alfredo Delgado	
 */


public class Ciudad  {
	
	private String nombre;
	private int costo;

	public Ciudad(String nombreNuevo, int costoNuevo){
		this.nombre	= nombreNuevo;
		this.costo	= costoNuevo;
	}

	public String getNombre(){
		return this.nombre;
	}

	public int getCosto(){
		return this.costo;
	}

	public void setNombre(String nuevoNombre){
		this.nombre = nuevoNombre;
	}

	public void setCosto(int nuevoCosto){
		this.costo = nuevoCosto;
	}

	@Override
	public String toString(){
		return this.nombre+" "+this.costo;
	}

	public static void main(String[] args) {
		Ciudad hola = new Ciudad ("Charallave", 10);
		System.out.println(hola);
	}
}