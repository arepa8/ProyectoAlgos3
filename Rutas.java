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

	public Ciudad obtenerCiudad(String laquetal){
		
		Ciudad resultado = null;
		
		for (int i=0; i<this.ciudades.size(); i++) {
			Ciudad aux = this.ciudades.get(i);
			String temp = aux.getNombre();
			if (temp.equals(laquetal)) {
				resultado = aux;
			}
		}

		return resultado;
	}

	public Autopista obtenerAutopista(String origen, String destino){
		
		Autopista resultado = null;
		
		for (int i=0; i<this.autopistas.size(); i++) {
			Autopista aux = this.autopistas.get(i);
			String temp1 = aux.getOrigen();
			String temp2 = aux.getDestino();
			if (temp1.equals(origen) && temp2.equals(destino)) {
				resultado = aux;
			}
		}

		return resultado;
	}

	public void modificarArista(Autopista aux){
		
		Ciudad temp1 = this.obtenerCiudad(aux.getOrigen());
		Ciudad temp2 = this.obtenerCiudad(aux.getDestino());

		int ganancia1, ganancia2, peaje, total;
		ganancia1 = temp1.getCosto();
		ganancia2 = temp2.getCosto();
		peaje = aux.getPeaje();

		total = ganancia1 + ganancia2 - peaje;
		
		aux.setPeaje(total);
	}

	public void modificarGrafo(){

		for (int i=0 ; i<this.autopistas.size() ; i++) {
			Autopista temporal = this.autopistas.get(i);
			this.modificarArista(temporal);
		}
	}

	public ArrayList<Ciudad> adyacentes(Ciudad gotica){

		ArrayList<Ciudad> resultado = new ArrayList<Ciudad>();

		for (int i=0; i<this.autopistas.size() ; i++) {
			
			Autopista temporal = this.autopistas.get(i);
			
			if (temporal.getOrigen().equals(gotica.getNombre())) {
				Ciudad agregar = this.obtenerCiudad(temporal.getDestino());
				resultado.add(agregar);
			}
		}

		return resultado;
	}

	//public caminosFactibles(){
		//Bellman con ciclos de costo negativo
	//}


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
					//System.out.println(chao.ciudades);
					//System.out.println(chao.autopistas);
					//System.out.println(chao.obtenerCiudad("SanJose"));
					//System.out.println(chao.obtenerAutopista("SanJose","PaloAlto"));

					//Autopista hola = chao.obtenerAutopista("PaloAlto","SanJose");
					//chao.modificarArista(hola);
					//System.out.println(hola);

					//System.out.println(chao.adyacentes(chao.obtenerCiudad("Berkeley")));

					//chao.modificarGrafo();
					//System.out.println(chao.autopistas);
					/* SIRVEN TODOS HASTA AHORA */

					chao = new Rutas();
				}
				in.close();
			}
			catch(Exception e){System.out.println("Error al leer el archivo");e.printStackTrace();}
	}
}



