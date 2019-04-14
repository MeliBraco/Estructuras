package ListaEnlazada;

public class Nodo {

	private String valor;
	Nodo siguiente;
	Nodo anterior;
	
	public Nodo(String valor){
		this.valor = valor;
	}
	
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	public Nodo getAnterior() {
		return anterior;
	}
	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	
}
