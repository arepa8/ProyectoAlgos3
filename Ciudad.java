/*
 * Clase Ciudad
 *
 */


public class Ciudad  {
	
	private String nombre;
	private int costo;

	public String getNombre(){
		return this.nombre;
	}

	public int getCosto(){
		return this.costo;
	}

	public void setCosto(int nuevoCosto){
		this.costo = nuevoCosto;
	}
}