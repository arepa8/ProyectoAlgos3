/*
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
	
	private ArrayList<Ciudad> ciudades;
	private ArrayList<Autopista> autopistas;

	public static void obtenerGrafo(String archivo)
	
		throws IOException {

	    File datos = new File (archivo);
	    Scanner scan = new Scanner(datos);

	    while (scan.hasNextLine()){

	    	String line = scan.nextLine();
	    	System.out.println(line);
	    }

	    scan.close();
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
		try{
			obtenerGrafo(args[0]);
		}
		catch(Exception e){System.out.println("Error al leer el archivo");}
	}
}