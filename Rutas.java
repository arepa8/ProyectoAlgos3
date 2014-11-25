/**
 * Proyecto 3
 *
 * @author	Andres Hernandez
 *			Alfredo Delgado	
 *
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;


public class Rutas {
	
	private ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
	private ArrayList<Autopista> autopistas = new ArrayList<Autopista>();
	private int numCiudades, numAutopistas;

	public void obtenerGrafo(Scanner in)
	
		throws IOException {

		int iterador = 1;

		this.numCiudades = in.nextInt();
		this.numAutopistas = in.nextInt();
		int tope = this.numAutopistas+this.numCiudades;
	   
	    while (in.hasNextLine() && iterador<=tope ){

			if (iterador<=this.numCiudades){

	    		String nombre = in.next();
	    		int costo = in.nextInt();
	    		Ciudad aux = new Ciudad(nombre, costo);
	    		this.ciudades.add(aux);
	    	}

	    	if (iterador>this.numCiudades && iterador<=tope) {
	    		
	    		String origen = in.next();
	    		String destino = in.next();
	    		int peaje = in.nextInt();
	    		Autopista temp = new Autopista(origen,destino,peaje);
	    		this.autopistas.add(temp);
	    	}
	    	iterador = iterador+1;
	    } 
	}

	/*public modificarGrafo(){
		//se modifica el grafo para usar solo el costo de las aristas
	}

	public caminosFactibles(){
		//Bellman con ciclos de costo negativo
	}

	public static void main(String[] args) {
		
	}*/

	public static void main(String[] args) {
		
		Rutas chao = new Rutas();
		int casosDePrueba, iterador=0;

			try{
				FileReader file = new FileReader(args[0]);
				Scanner in = new Scanner(file); 

				casosDePrueba = in.nextInt();

				while (iterador!=casosDePrueba){ 
					chao.obtenerGrafo(in);
					iterador++;
					System.out.println(chao.ciudades);
					System.out.println(chao.autopistas);
					chao = new Rutas();
				}
				in.close();
			}
			catch(Exception e){System.out.println("Error al leer el archivo");e.printStackTrace();}
	}
}



