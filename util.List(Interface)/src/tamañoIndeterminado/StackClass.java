package tamañoIndeterminado;
import java.util.Stack;


class StackClass {

	private Stack<String> pila = new Stack<String>();
	
	public void introducirElemento(String elemento){
		pila.push(elemento);
	}
	public void sacaUnElemento(){ //se ecierra en un bloque try catch por si no existe elemento para borrar
		pila.pop();
	}
	public Object consultaElemento(){
		return pila.peek();
	}
	public boolean consultaSiEstaVacio(){
		return pila.isEmpty();
	}
	public int buscarElemento(String elemento){
		return pila.search(elemento);
	}
}
