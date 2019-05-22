package archivo;

import java.util.ArrayList;

/**
 * @author Ana Laura Corral Descargue
 */
public class Elemento {

	private ArrayList<Double> lista;
	public String nombre;

	
	public Elemento(ArrayList<Double> lista, String nombre) {
		super();
		this.lista=lista;
		this.nombre = nombre;
	}
		
	public ArrayList<Double> getLista() {
		return lista;
	}
	
	public void setLista(ArrayList<Double> lista) {
		this.lista = lista;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
