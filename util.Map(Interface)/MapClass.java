import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


class MapClass {

	private Map<Integer,String> map = new HashMap<Integer,String>();


	public int cantidadDeElementos(){
		return map.size();
	}
	public boolean estaVacio(){
		return map.isEmpty();
	}
	public void insertaElemento(int key, String valor){
		 map.put(key, valor);
	}
	public String obtenerElemento(int key){
		return map.get(key);
	}
	public void borrarTodosLosElementos(){
		 map.clear();
	}
	public void borrarElemento(int key){
		 map.remove(key);
	}
	public boolean verificarSiExisteElemento(String valor){
		return map.containsValue(valor);
	}
	public boolean verificarSiExisteElementoSegunLaClave(int key){
		return map.containsKey(key);
	}
	public boolean determinarIgualdad(Object otroMap){
		return map.equals(otroMap);
	}
	public void recorrerMap(){
		
		Iterator<Integer> iterador = map.keySet().iterator();
		while(iterador.hasNext()){
			Integer clave =iterador.next();
			System.out.println("Clave: " +clave+ "-------------> " +map.get(clave));
		}
	}
}
