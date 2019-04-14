package tamañoIndeterminado;

import java.util.*;

class arreglo  {

	private static ArrayList<String> lista= new ArrayList<String>();
	private static  ListIterator<String> iterador;
	
	public static void main(String[]arg){
		
		agregarElemento("india");
		agregarElemento("logan");
		agregarElemento("marta");
		agregarElemento("sebastian");
		agregarElemento("melina");
		agregarElemento("belen");
		agregarElemento("marcela");
		agregarElemento("humberto");
		agregarElemento("jimena");
		System.out.println(longitud());
		
		Collections.sort(lista);
		recorrerArray();
		
		
	}
	
	public static void agregarElemento(String elemento){
		 lista.add(elemento);
	}
	public boolean elementoAgregadoCorrectamente(String nombre){
		return lista.add(nombre);
	}
	public boolean existeElemento(String elemento){
		return lista.contains(elemento);
	}
	public Object clonar(){
		return lista.clone();
	}
	public String obtenerElemento(int pocision){
		return lista.get(pocision-1);	
	}
	public boolean estaVacia(){
		return lista.isEmpty();
	}
	public void vaciarLista(){
		lista.clear();
	}
	public void eliminarElemento(int pocision){
		lista.remove(pocision-1);
	}
	public static int longitud(){
		return lista.size();
	}
	public void replazaObjetoExistenta(int pocision, String elemento){
		 lista.set(pocision, elemento);
	}
	public List<String> sublista(int pocisionInicial, int pocisionFinal){
		return lista.subList(pocisionInicial-1, pocisionFinal-1);
	}
	
	
	
	
	public static void recorrerArray(){

		iterador = lista.listIterator();
		while(iterador.hasNext()){
			String elemento = iterador.next();
			System.out.println(elemento);
		}
	}
	public static void borrarLista(){

		iterador = lista.listIterator();
		while (iterador.hasNext()) {
			iterador.next();
			iterador.remove();
		}
	}
}

