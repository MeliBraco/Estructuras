package tamañoIndeterminado;
import java.util.LinkedList;

class linkedListClass {

	private LinkedList<String> lista = new LinkedList<String>();
	
	public void agregarElemento(String elemento){
		 lista.add(elemento);
	}
	public boolean elementoAgregadoCorrectamente(String nombre){
		return lista.add(nombre);
	}
	public void agregarElementoPrimeraPosicion(String nombre){
		 lista.addFirst(nombre);
	}
	public void agregarElementoUltimaPosicion(String nombre){
		 lista.addLast(nombre);
	}
	public boolean existeElemento(String elemento){
		return lista.contains(elemento);
	}
	public Object clonar(){
		return lista.clone();
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
	public int longitud(){
		return lista.size();
	}
	public Object obtenerPrimerElemento(){
		 return lista.getFirst();
	}
	public Object obtenerUltimoElemento(){
		 return lista.getLast();
	}
	public String obtenerElemento(int pocision){
		return lista.get(pocision-1);	
	}
	public void replazaObjetoExistenta(int pocision, String elemento){
		 lista.set(pocision, elemento);
	}
}
